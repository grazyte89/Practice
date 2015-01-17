package inherit7;

import java.util.List;

public class SecondBase extends BaseNo{

	private String name;
	
	public SecondBase()
	{
		super();
		System.out.println("secondclass");
		//doingSomething();
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public List<String> getData()
	{
		return getDataFromList();
	}
	
	public void doingSomething()
	{
		for(int i = 0; i < 5; i++)
		{
			addToListData("Data value " + i + " being executed in Second base");
		}
	}
}
