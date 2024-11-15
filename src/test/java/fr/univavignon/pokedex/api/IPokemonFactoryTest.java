package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IPokemonFactoryTest extends TestCase {

    private IPokemonFactory factory;

    @Before
    public void setUp() {
        factory = new PokemonFactoryImpl();
    }

    @Test
    public void testCreatePokemon() throws PokedexException {
        Pokemon pokemon = factory.createPokemon(0, 613, 64, 4000, 4);
        assertNotNull("Pokemon is null", pokemon);
        assertEquals("Incorrect index", 0, pokemon.getIndex());
        assertEquals("Incorrect name", "ExampleName", pokemon.getName());
        assertEquals("Incorrect attack", 100, pokemon.getAttack());
        assertEquals("Incorrect defense", 100, pokemon.getDefense());
        assertEquals("Incorrect stamina", 100, pokemon.getStamina());
        assertEquals("Incorrect CP", 613, pokemon.getCp());
        assertEquals("Incorrect HP", 64, pokemon.getHp());
        assertEquals("Incorrect dust", 4000, pokemon.getDust());
        assertEquals("Incorrect candy", 4, pokemon.getCandy());
        assertEquals("Incorrect IV", 56.0, pokemon.getIv(), 0.0);
    }
}