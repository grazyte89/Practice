package polymo8;

public abstract class Animal {
	/*
	 * our base class to demonstrate ploymorphism 
	 */
	private String name;
	private String food;
	
	public Animal()
	{
		this.name = null;
		this.food = null;
	}
	
	public Animal(String name, String food)
	{
		this.name = name;
		this.food = food;
	}
	
	public String getname()
	{
		return this.name;
	}
	
	public String getfood()
	{
		return this.food;
	}
	
	public void setname(String name)
	{
		this.name = name;
	}
	
	public void setfood(String food)
	{
		this.food = food;
	}
	
	public void movement()
	{
		System.out.println("The movment " + this.name + " is ");
	}
	
	public void speedmo()
	{
		System.out.println(this.name + " " + getspeed());
	}
	
	public String toString()
	{
		return (this.name + " " + this.food);
	}
	
	public abstract int getspeed();
	public abstract void setspeed();
}
