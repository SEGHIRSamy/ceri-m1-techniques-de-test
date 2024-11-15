package fr.univavignon.pokedex.api;

public class PokemonTrainerFactoryImpl implements IPokemonTrainerFactory {

    @Override
    public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
        IPokemonMetadataProvider metadataProvider = new PokemonMetadataProviderImpl();
        IPokemonFactory pokemonFactory = new PokemonFactoryImpl();

        IPokedex pokedex = pokedexFactory.createPokedex(metadataProvider, pokemonFactory);

        return new PokemonTrainer(name, team, pokedex);
    }
}