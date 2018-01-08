package pokemon.model;

public class Bulbasaur extends Pokemon implements Grass 
{
	public Bulbasaur()
	{
		super(1, "Bulbasaur");
		setup();
	}
	
	public Bulbasaur(String name)
	{
		super(1, name);
		setup();
	}
	
	protected void setup()
	{
		this.setAttackPoints(49);
		this.setCanEvolve(true);
		this.setEnhancementModifier(.89);
		this.setHealthPoints(45);
	}
	
	public Bulbasaur(int number, String name)
	{
		super(number, name);
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

	@Override
	public int Terraform(int damage) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int SideSwipe(int damage) {
		// TODO Auto-generated method stub
		return 0;
	}
}
