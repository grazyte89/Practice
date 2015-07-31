package polymo8;

public abstract class Animal {
	
	/* our base class to demonstrate polymorphism */
	
	/* This is also an abstract class. An abstract class is class with an abstract method, meaning we added a method
	   that is undefined with just a method header. */
	
	/* An abstract method is an undefined method which acts as placeholder, which tell the java that we have an 
	   undefined method which we hope will be overridden(define) in one of the child class.
	   at the bottom of this page is an abstract method */
	
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
	
	public abstract int getspeed(); // abstract method
	public abstract void setspeed();
}
