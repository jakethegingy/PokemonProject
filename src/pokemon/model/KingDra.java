package pokemon.model;

public class KingDra extends SeaDra implements Water
{
	public KingDra(int number, String name)
	{
		super(number, name);
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
