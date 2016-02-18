package inheritenceChapter7;

public class ThirdBase extends SecondBase{
	
	public ThirdBase()
	{
		//super();
		/* super() constructor will execute the content with this classes bases class */
		System.out.println("third");
		System.out.println(getNumber());
	}
	
	public void addData(String string)
	{
		addToListData(string);
	}
	
	public void everyData()
	{
		for(String string : getDataFromList())
		{
			System.out.println(string);
		}
	}

	@Override
	public void doingSomething() 
	{
		for(int i = 0; i < 5; i++)
		{
			addToListData("Data value " + i + 5 * 6 + " being executed in third base");
		}
	}
	
	public void priChange()
	{
		System.out.println("third");
	}
}
