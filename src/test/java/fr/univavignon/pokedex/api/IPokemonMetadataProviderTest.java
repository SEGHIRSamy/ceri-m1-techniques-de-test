package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class IPokemonMetadataProviderTest extends TestCase {

    private IPokemonMetadataProvider provider;

    @Before
    public void setUp() {
        provider = new PokemonMetadataProviderImpl();
    }

    @Test
    public void testGetPokemonMetadata() throws PokedexException {
        PokemonMetadata result = provider.getPokemonMetadata(0);
        assertNotNull("PokemonMetaData null", result);
        assertEquals("Mauvais Index", 0, result.getIndex());
        assertEquals("Mauvais Nom", "ExampleName", result.getName());
        assertEquals("Mauvais Attaque", 100, result.getAttack());
        assertEquals("Mauvais Defense", 100, result.getDefense());
        assertEquals("Mauvais Stamina", 100, result.getStamina());
    }

    @Test
    public void testIndexRange() throws PokedexException {
        PokemonMetadata result = provider.getPokemonMetadata(0);
        assertTrue("Index en dehors de 0-150", result.getIndex() >= 0 && result.getIndex() <= 150);
    }
}