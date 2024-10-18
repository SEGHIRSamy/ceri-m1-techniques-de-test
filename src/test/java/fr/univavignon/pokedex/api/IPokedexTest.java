package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Comparator;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokedexTest extends TestCase {

    private IPokedex provider;
    private Pokemon pokemon;

    @Before
    public void setUp() throws PokedexException {
        provider = mock(IPokedex.class);
        pokemon = new Pokemon(0, "Bulbizarre", 126, 126, 90, 613, 64, 4000, 4, 56.0);
        when(provider.addPokemon(pokemon)).thenReturn(0);
        when(provider.getPokemon(0)).thenReturn(pokemon);
        when(provider.size()).thenReturn(0).thenReturn(1);
        when(provider.getPokemons()).thenReturn(Arrays.asList(pokemon));
        when(provider.getPokemons(Comparator.comparing(Pokemon::getCp))).thenReturn(Arrays.asList(pokemon));
    }

    @Test
    public void testSize() {
        assertEquals(0, provider.size());
        provider.addPokemon(pokemon);
        assertEquals(1, provider.size());
    }

    @Test
    public void testAddPokemon() {
        int index = provider.addPokemon(pokemon);
        assertEquals(0, index);
    }

    @Test
    public void testGetPokemon() throws PokedexException {
        provider.addPokemon(pokemon);
        Pokemon retrievedPokemon = provider.getPokemon(0);
        assertEquals(pokemon, retrievedPokemon);
    }

    @Test(expected = PokedexException.class)
    public void testGetPokemonWithInvalidId() throws PokedexException {
        provider.getPokemon(1);
    }

    @Test
    public void testGetPokemons() {
        provider.addPokemon(pokemon);
        List<Pokemon> pokemons = provider.getPokemons();
        assertEquals(1, pokemons.size());
        assertEquals(pokemon, pokemons.get(0));
    }
}