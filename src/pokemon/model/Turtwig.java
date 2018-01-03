package pokemon.model;

public class Turtwig extends Pokemon implements Grass,
{
	public Turtwig()
	{
		super(387, "Turtwig");
	}
	
	public Turtwig(String name)
	{
		super(387, name);
		setup();
	}
	
	public Turtwig(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(234);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(123);
	}
}
