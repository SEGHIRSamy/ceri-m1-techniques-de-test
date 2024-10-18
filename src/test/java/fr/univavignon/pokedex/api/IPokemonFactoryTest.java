package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonFactoryTest extends TestCase {

    private IPokemonFactory provider;
    private Pokemon pokemon;

    @Before
    public void setUp() throws PokedexException {
        provider = mock(IPokemonFactory.class);
        pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90,613,64,4000,4,56);
        when(provider.createPokemon(0, 613, 64, 4000, 4)).thenReturn(pokemon);
    }

@Test
    public void testCreatePokemon() throws PokedexException {
        Pokemon result = provider.createPokemon(0, 613, 64, 4000, 4);
        assertNotNull("Pokemon null", result);
        assertEquals("Mauvais Index", 0, result.getIndex());
        assertEquals("Mauvais CP", 613, result.getCp());
        assertEquals("Mauvais HP", 64, result.getHp());
        assertEquals("Mauvais Dust", 4000, result.getDust());
        assertEquals("Mauvais Candy", 4, result.getCandy());
        assertEquals("Mauvais IV", 56.0, result.getIv());
    }
}