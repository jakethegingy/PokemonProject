package pokemon.model;

public class Turtwig extends Pokemon implements Grass
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
	public int RazorLeaf(int damage)
	{
		int attack = -50;
		return attack; 
	}
	
	public int Synthesis(int health)
	{
		int heal = 25;
		return heal;
	}
	
	public int Tackle(int damage)
	{
		int attack = -10;
		return attack; 
				
	}


	public int Terraform(int damage) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int SideSwipe(int damage) {
		// TODO Auto-generated method stub
		return 0;
	}
}
