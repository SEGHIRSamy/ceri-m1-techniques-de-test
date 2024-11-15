package fr.univavignon.pokedex.api;

public class PokemonTrainerFactoryImpl implements IPokemonTrainerFactory {

    @Override
    public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
        IPokedex pokedex = pokedexFactory.createPokedex();

        // Create and return a new PokemonTrainer instance
        return new PokemonTrainer(name, team, pokedex);
    }
}