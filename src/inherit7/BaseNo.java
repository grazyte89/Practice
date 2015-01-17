package inherit7;

import java.util.ArrayList;
import java.util.List;

public class BaseNo {
	
	private int number;
	List<String> strings = new ArrayList<String>();
	
	public BaseNo()
	{
		System.out.println("what's up, base class");
		doingSomething();
		// the doingSomething method, when executed, will execute the latest definition from its 
		// child class.
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
		System.out.println("base class jv;k;v");
	}
}
