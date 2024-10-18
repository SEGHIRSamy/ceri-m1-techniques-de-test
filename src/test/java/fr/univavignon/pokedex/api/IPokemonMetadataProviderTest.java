package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonMetadataProviderTest extends TestCase {

    private IPokemonMetadataProvider provider;
    private PokemonMetadata metadata;

    @Before
    public void setUp() throws PokedexException {
        provider = mock(IPokemonMetadataProvider.class);
        metadata = new PokemonMetadata(0, "Bulbizarre", 126, 126, 90);
        when(provider.getPokemonMetadata(0)).thenReturn(metadata);
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        PokemonMetadata result = provider.getPokemonMetadata(0);
        assertNotNull("PokemonMetaData null", result);
        assertEquals("Mauvais Index",0, result.getIndex());
        assertEquals("Mauvais Nom","Bulbizarre", result.getName());
        assertEquals("Mauvais Attaque",126, result.getAttack());
        assertEquals("Mauvais Defense",126, result.getDefense());
        assertEquals("Mauvais Stamina",90, result.getStamina());
    }

    @Test
    public void testIndexRange() throws PokedexException {
        PokemonMetadata result = provider.getPokemonMetadata(0);
        assertTrue("Index en dehors de 0-150", result.getIndex() >= 0 && result.getIndex() <= 150);
    }
}