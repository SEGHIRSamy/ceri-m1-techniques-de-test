package fr.univavignon.pokedex.api;

import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class IPokemonTrainerFactoryTest extends TestCase {

    private IPokemonTrainerFactory trainerFactory;
    private IPokedexFactory pokedexFactory;

    @Before
    public void setUp() {
        trainerFactory = new PokemonTrainerFactoryImpl();
        pokedexFactory = new IPokedexFactory() {
            @Override
            public IPokedex createPokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
                return new PokedexImpl(metadataProvider, pokemonFactory);
            }
        };
    }

    @Test
    public void testCreateTrainer() throws PokedexException {
        PokemonTrainer trainer = trainerFactory.createTrainer("Ash", Team.VALOR, pokedexFactory);
        assertNotNull("Trainer is null", trainer);
        assertEquals("Incorrect name", "Ash", trainer.getName());
        assertEquals("Incorrect team", Team.VALOR, trainer.getTeam());
        assertNotNull("Pokedex is null", trainer.getPokedex());
    }
}