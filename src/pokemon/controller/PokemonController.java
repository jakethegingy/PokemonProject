package pokemon.controller;

import pokemon.model.Pokemon;
import java.util.List;
import java.util.ArrayList;

public class PokemonController 
{
	private List<Pokemon> pokedex;
	
	public List<Pokemon> getPokedex()
	{
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
