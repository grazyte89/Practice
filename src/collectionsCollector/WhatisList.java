package collectionsCollector;

import java.util.ArrayList;
import java.util.List;


public class WhatisList {
	
	public WhatisList()
	{
		//
	}
	
	public void executionlPoint()
	{
		List<String> list = new ArrayList<String>();
		this.doThingsTwice(list);
		this.showEverything(list);
	}
	
	private void doThingsTwice(List<String> list)
	{
		for(int i = 0; i < 10; i++)
		{
			String string = String.valueOf(GibberishWordGenerator.randomWordGenerator());
			list.add(string);
			list.add(string);
		}
	}
	
	private void showEverything(List<String> list)
	{
		for(String stringIn : list)
		{
			System.out.println(stringIn);
		}
	}

}
