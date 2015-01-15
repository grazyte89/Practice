package inherit7;

import java.util.ArrayList;
import java.util.List;

public class BaseNo {
	
	private int number;
	List<String> strings = new ArrayList<String>();
	
	public BaseNo()
	{
		System.out.println("what's up, base class");
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
}
