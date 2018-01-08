package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander()
	{
		super(4, "Charmander");
		setup();
	}
	
	public Charmander(String name)
	{
		super(4, name);
		setup();
	}
	
	public Charmander(int number, String name)
	{
		super(number, name);
	}
	
	protected void setup()
	{
		this.setAttackPoints(52);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(39);
	}
	
	public int slash(int damage)
	{
		int attack = -10;
		return attack;
	}
	
	public int flamethrower(int burn)
	{
		int damage = -60;
		return damage;
	}
	
	public int ember(int burn)
	{
		int damage = -15;
		return damage; 
	}
}
