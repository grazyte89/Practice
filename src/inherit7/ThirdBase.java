package inherit7;

public class ThirdBase extends SecondBase{
	
	public ThirdBase()
	{
		super();
		System.out.println("tird");
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
}
