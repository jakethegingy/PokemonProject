package pokemon.model;

public class Charmander extends Pokemon implements Fire
{
	public Charmander(int number, String name)
	{
		super(number, name);
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
