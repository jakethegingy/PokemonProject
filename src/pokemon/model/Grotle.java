package pokemon.model;

public class Grotle extends Turtwig
{
	public Grotle()
	{
		super(388, "Grotle");
	}
	
	public Grotle(String name)
	{
		super(388, name);
	}
	
	public Grotle(int number, String name)
	{
		super(number, name);
		setup();
	}
	
	@Override
	protected void setup()
	{
		super.setup();
		this.setAttackPoints(324);
	}
}
