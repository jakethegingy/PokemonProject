package pokemon.model;

public class Pokemon 
{
	private int healthPoints;
	private int attackPoints;
	private double enhancementModifier;
	private int number;
	private String name;
	private boolean canEvolve;
	
	public Pokemon(int number, String name) 
	{
		this.name = name;
		this.number = number;
	}
	
	 public final String[] getPokemonTypes()
	 {
		 Class<?> [] types = getClass().getInterfaces();
		 String [] pokeTypes = new String[types.length];
		 
		 for(int index = 0; index < types.length; index++)
		 {
			 String currentInterface = types[index].getCanonicalName();
			 currentInterface = currentInterface.replace(this.getClass().getPackage().getName() + ".",  "");
			 pokeTypes[index] = currentInterface;
		 }

		 return pokeTypes;
	 }
	 
	 public String toString()
	 {
		 String description = name + "my HP is: " + healthPoints;
		 
		 return description;
	 }
	 
	 public String getPokemonInformation()
	 {
		 String pokemonInfo ="Type: " + this.getClass().getSimpleName();
		 
		 return pokemonInfo;
	 }

	/**
	 * @return the healthPoints
	 */
	public int getHealthPoints() 
	{
		return healthPoints;
	}

	/**
	 * @param healthPoints the healthPoints to set
	 */
	public void setHealthPoints(int healthPoints) 
	{
		this.healthPoints = healthPoints;
	}

	/**
	 * @return the attackPoints
	 */
	public int getAttackPoints() 
	{
		return attackPoints;
	}

	/**
	 * @param attackPoints the attackPoints to set
	 */
	public void setAttackPoints(int attackPoints) 
	{
		this.attackPoints = attackPoints;
	}

	/**
	 * @return the enhancementModifier
	 */
	public double getEnhancementModifier() 
	{
		return enhancementModifier;
	}

	/**
	 * @param enhancementModifier the enhancementModifier to set
	 */
	public void setEnhancementModifier(double enhancementModifier)
	{
		this.enhancementModifier = enhancementModifier;
	}

	/**
	 * @return the name
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * @return the canEvolve
	 */
	public boolean isCanEvolve() 
	{
		return canEvolve;
	}

	/**
	 * @param canEvolve the canEvolve to set
	 */
	public void setCanEvolve(boolean canEvolve) 
	{
		this.canEvolve = canEvolve;
	}

	/**
	 * @return the number
	 */
	public int getNumber() 
	{
		return number;
	}
}
