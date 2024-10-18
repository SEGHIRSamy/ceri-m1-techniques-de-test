package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexFactoryTest extends TestCase {

    private IPokedexFactory provider;
    private IPokedex pokedex;
    private IPokemonMetadataProvider pokemonMetadataProvider;
    private IPokemonFactory pokemonFactory;

    @Before
    public void setUp() throws PokedexException {
        provider = mock(IPokedexFactory.class);
        pokedex = mock(IPokedex.class);
        when(provider.createPokedex(pokemonMetadataProvider,pokemonFactory)).thenReturn(pokedex);
    }

    @Test
    public void testCreatePokedex() throws PokedexException {
        IPokedex result = provider.createPokedex(pokemonMetadataProvider,pokemonFactory);
        assertNotNull("Pokedex null", result);
        assertEquals("Mauvais Pokedex", pokedex, result);
    }
}