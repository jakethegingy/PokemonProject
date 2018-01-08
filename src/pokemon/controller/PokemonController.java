package pokemon.controller;

import pokemon.model.Pokemon;
import java.util.List;
import java.util.ArrayList;
import pokemon.model.*;

public class PokemonController 
{
	private List<Pokemon> pokedex;
	
	public List<Pokemon> getPokedex()
	{
		pokedex.add(new Bulbasaur());
		pokedex.add(new Charmander());
		pokedex.add(new Grotle());
		pokedex.add(new KingDra());
		pokedex.add(new Squirtle());
		pokedex.add(new SeaDra());
		pokedex.add(new Turtwig());
		pokedex.add(new Volcanion());
		
		return pokedex;
	}
	
	public PokemonController()
	{
		
		//Types: Grass, Fire, and water
		// Moves Grass: Razor leaf, Tackle, and Synthesis
		// Moves Fire: Flamethrower, Ember, and Slash
		// Moves Water: IronDefense, HydroPump, and WaterPulse.
	}
	
	public boolean isValidInteger(String input)
	{
		boolean valid = false;
		
		try
		{
			Integer.parseInt(input);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			
		}
		return valid;
	}
	
	public boolean isValidDouble(String input)
	{
		boolean valid = false;
		
		try
		{
			Double.parseDouble(input);
			valid = true;
		}
		catch (NumberFormatException error)
		{
			
		}
		
		return valid;
	}
	
	public void start()
	{
		
	}
	
}
