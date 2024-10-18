package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class IPokemonTrainerFactoryTest extends TestCase {

    private IPokemonTrainerFactory provider;
    private PokemonTrainer pokemonTrainer;
    private IPokedex pokedex;
    private IPokedexFactory pokedexFactory;

    @Before
    public void setUp() throws PokedexException {
        provider = mock(IPokemonTrainerFactory.class);
        pokemonTrainer = new PokemonTrainer("Kelian",Team.VALOR,pokedex);
        when(provider.createTrainer("Kelian",Team.VALOR,pokedexFactory)).thenReturn(pokemonTrainer);
    }

    @Test
    public void testCreateTrainer() throws PokedexException {
        PokemonTrainer result = provider.createTrainer("Kelian",Team.VALOR,pokedexFactory);
        assertNotNull("Trainer null", result);
        assertEquals("Mauvais Nom", "Kelian", result.getName());
        assertEquals("Mauvais Team", Team.VALOR, result.getTeam());
        assertEquals("Mauvais Pokedex",pokedexFactory, result.getPokedex());
    }
}