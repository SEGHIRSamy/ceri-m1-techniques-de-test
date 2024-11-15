package fr.univavignon.pokedex.api;

public class PokemonFactoryImpl implements IPokemonFactory {

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) throws PokedexException {
        if (index < 0 || index >= 151) { // Assuming there are 151 Pokémon
            throw new PokedexException("Invalid Pokémon index");
        }

        return new Pokemon(index, "ExampleName", 100, 100, 100, cp, hp, dust, candy, 56.0);
    }
}