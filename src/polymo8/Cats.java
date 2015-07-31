package polymo8;

public class Cats extends Animal{
	
	/* We have made the cat class a subclass of the Animal class: our base class, by using the 'extend' keyword 
	   (inheritance). */
	
	/* */ 
	
	private String breed;
	private int speed;
	
	public Cats()
	{
		super();
		this.breed = null;
		this.speed = 0;
	}
	
	public Cats(String name, String food)
	{
		super(name, food);
	}
	
	public Cats(String name, String food, String breed, int speed)
	{
		super(name, food);
		this.breed = breed;
		this.speed = speed;
	}
	
	public void setbreed(String breed)
	{
		this.breed = breed;
	}
	
	public String getbreed()
	{
		return this.breed;
	}
	
	public void setname(String name)
	{
		super.setname(name);
	}
	
	public void setfood(String food)
	{
		super.setfood(food);
	}
	
	public void movement()
	{
		System.out.println("These animals the cat named " + this.getname() + " move very fast");
	}

	public int getspeed() 
	{
		return speed;
	} 
	/* 
	 * When an Base class is an abstract, it forces the derived class to define the method 
	 * definition 
	 */
	public void setspeed() {
	
	}
}
