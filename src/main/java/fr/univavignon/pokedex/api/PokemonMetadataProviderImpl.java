package fr.univavignon.pokedex.api;

public class PokemonMetadataProviderImpl implements IPokemonMetadataProvider {

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        if (index < 0 || index >= 151) {
            throw new PokedexException("Invalid Pokémon index");
        }

        return new PokemonMetadata(index, "ExampleName", 100, 100, 100);
    }
}