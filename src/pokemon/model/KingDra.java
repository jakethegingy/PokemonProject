package pokemon.model;

public class KingDra extends SeaDra implements Water
{
	public KingDra()
	{
		super(230, "KingDra");
		setup();
	}
	
	public KingDra(String name)
	{
		super(230, name);
		setup();
	}
	
	public KingDra(int number, String name)
	{
		super(number, name);
	}
	
	@Override
	
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(95);
		this.setCanEvolve(false);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(75);
	}
	
	public boolean IronDefense()
	{
		return true;
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
