package inherit7;

import java.util.ArrayList;
import java.util.List;

public class BaseNo {
	
	
	private int number = 10;
	public List<String> strings = new ArrayList<String>();
	/* public variable will pass on properties the child class will be able to access, but private variables will 
	   not pass on as inheritance to the next class */
	
	public BaseNo()
	{
		System.out.println("what's up base class");
		doingSomething();
		/* the doingSomething method, when executed will execute the latest definition from its child class. 
		   This is done when the super() constructor is called in the child class. When it finds a method that 
		   Overridden, then it will use the latest definition */
		
		/* This action of executing the doingSomething can looked as dynamic/runtime polymorphism, because java compiler
		   will no execute the one in it class, but the latest definition of that method */ 
		System.out.println("nothing left");
		strings.add("First");
	}
	
	public BaseNo(int number) 
	{
		this.number = number;
	}

	public int getNumber()
	{
		return number;
	}

	public void setNumber(int number)
	{
		this.number = number;
	}
	
	public void addToListData(String string)
	{
		strings.add(string);
	}
	
	public List<String> getDataFromList()
	{
		return strings;
	}
	
	private void priCheckingSomething()
	{
		System.out.println("private base class checking " + 1);
	}
	
	public void pubCheckingSomething()
	{
		System.out.println("public base class checking ");
	}
	
	public void testSomething()
	{
		priCheckingSomething();
		pubCheckingSomething();
	}
	
	public void doingSomething()
	{
		// this method is difference in every class, we will see which methods will be used by java.
		for(int i = 0; i < 5; i++)
		{
			addToListData("Data value " + i + " being executed in base class, hellololololololol");
		}
	}
}
