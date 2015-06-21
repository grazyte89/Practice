package collectionsCollector;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class WhatisList {
	
	/* a list is data structure similar to an array, in that it holds an collection data(items), but unlike 
	   the array which is fixed, list are dynamic and the size of the list can change */
	
	private String listTypeState;
	private List<String> list;
	private Scanner scanner = new Scanner(System.in);
	
	public void executionlPoint()
	{
		stateChoosing();
		menuOfChoosingListType();
	}
	
	private String stateChoosing()
	{
		
		System.out.println("Enter the type of list");
		this.listTypeState = scanner.next();
		return listTypeState;
	}
	
	public String getListTypeState() 
	{
		return listTypeState;
	}

	public void setListTypeState(String listTypeState) 
	{
		this.listTypeState = listTypeState;
	}
	
	private void menuOfChoosingListType()
	{
		switch (listTypeState.toLowerCase()) {
		case "arraylist":
			list = new ArrayList<String>();
			break;
		case "linked":
			list = new LinkedList<String>();
			break;
		default:
			System.out.println("Error");
			break;
		}
	}
	
	public void addDataToTheList(String data)
	{
		this.list.add(data);
	}
	
	public void generateDataTwice(List<String> list, int numberOfData)
	{
		for(int i = 0; i < numberOfData; i++)
		{
			String string = String.valueOf(GibberishWordGenerator.randomWordGenerator());
			addDataToTheList(string);
			list.add(string);
		}
	}
	
	public void showEverything(List<String> list)
	{
		for(String stringIn : list)
		{
			System.out.println(stringIn);
		}
	}
}
