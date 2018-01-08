package pokemon.model;

public class SeaDra extends Pokemon implements Water
{
	public SeaDra()
	{
		super(117, "SeaDra");
		setup();
	}
	
	public SeaDra(String name)
	{
		super(117, name);
		setup();
	}
	
	public SeaDra(int number, String name)
	{
		super(number, name);
	}
	public boolean IronDefense()
	{
		return true;
	}
	
	protected void setup()
	{
		this.setAttackPoints(65);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(55);
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
