package pokemon.model;

public class Squirtle extends Pokemon implements Water
{
	public Squirtle()
	{
		super(7, "Squirtle");
		setup();
	}
	
	public Squirtle(String name)
	{
		super(7, name);
		setup();
	}
	
	public Squirtle(int number, String name)
	{
		super(number, name);
	}
	
	public boolean IronDefense()
	{
		return true;
	}
	
	protected void setup()
	{
		this.setAttackPoints(48);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(44);
	}

	public int Hydropump(int erosion)
	{
		int damage = -55;
		return damage;
	}
	
	public int WaterPulse(int erosion)
	{
		int damage = -20;
		return damage;
	}
}
