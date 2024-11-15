package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class IPokemonFactoryTest {

    private IPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = new PokemonFactoryImpl();
    }

    @Test
    public void testCreatePokemon() throws PokedexException {
        int index = 0;
        int cp = 500;
        int hp = 60;
        int dust = 4000;
        int candy = 3;

        Pokemon pokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        assertNotNull(pokemon);
        assertEquals(index, pokemon.getIndex());
        assertEquals(cp, pokemon.getCp());
        assertEquals(hp, pokemon.getHp());
        assertEquals(dust, pokemon.getDust());
        assertEquals(candy, pokemon.getCandy());
    }

}