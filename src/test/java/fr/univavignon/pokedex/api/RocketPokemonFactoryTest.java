package fr.univavignon.pokedex.api;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RocketPokemonFactoryTest {

    private RocketPokemonFactory pokemonFactory;

    @Before
    public void setUp() {
        pokemonFactory = new RocketPokemonFactory();
    }

    @Test
    public void testCreatePokemon() {
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

    @Test
    public void testCreatePokemonWithDifferentIndex() {
        int index = 133;
        int cp = 1000;
        int hp = 120;
        int dust = 5000;
        int candy = 10;

        Pokemon pokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        assertNotNull(pokemon);
        assertEquals(index, pokemon.getIndex());
        assertEquals(cp, pokemon.getCp());
        assertEquals(hp, pokemon.getHp());
        assertEquals(dust, pokemon.getDust());
        assertEquals(candy, pokemon.getCandy());
    }

    @Test
    public void testCreatePokemonWithInvalidIndex() {
        int index = -1;
        int cp = 500;
        int hp = 60;
        int dust = 4000;
        int candy = 3;

        Pokemon pokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        assertNotNull(pokemon);
        assertEquals("Ash's Pikachu", pokemon.getName());
    }

    @Test
    public void testCreatePokemonWithIndexOutOfUpperBound() {
        int index = 155;
        int cp = 500;
        int hp = 60;
        int dust = 4000;
        int candy = 3;

        Pokemon pokemon = pokemonFactory.createPokemon(index, cp, hp, dust, candy);

        assertNotNull(pokemon);
        assertEquals("MISSINGNO", pokemon.getName());
    }
}