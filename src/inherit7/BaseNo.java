package inherit7;

import java.util.ArrayList;
import java.util.List;

public class BaseNo {
	
	
	private int number = 10;
	List<String> strings = new ArrayList<String>();
	
	public BaseNo()
	{
		System.out.println("what's up base class");
		doingSomething();
		/* the doingSomething method, when executed will execute the latest definition from its child class. 
		   This is done when the super() constructor is called in the child class. When it finds a method that 
		   Overridden, then it will use the latest definition */
		System.out.println("nothing left");
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
	
	public void doingSomething()
	{
		// this method is difference in every class, we will see which methods will be used by java.
		for(int i = 0; i < 5; i++)
		{
			addToListData("Data value " + i + " being executed in base class, hellololololololol");
		}
	}
}
