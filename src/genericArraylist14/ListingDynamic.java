package genericArraylist14;

import java.util.ArrayList;
import java.util.Scanner;

public class ListingDynamic {
	
	private ArrayList<String> list = new ArrayList<String>(20);
	private Scanner input = new Scanner(System.in);
	
	private String data;
	
	public ListingDynamic ()
	{
		
	}
	
	public void start()
	{
		insertdata();
		showdata();
		ridblank();
		showdata();
	}
	
	private void insertdata()
	{
		System.out.println("Enter string data ");
		data = input.nextLine();
		for(char c: data.toCharArray())
		{
			Character i = new Character(c);
			list.add(i.toString());
		}
	}
	
	private void showdata()
	{
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
	}
	
	private void ridblank()
	{
		System.out.println(" ");
		for(char c: data.toCharArray())
		{
			if(c == ' ')
			{
				Character i = new Character(c);
				list.remove(i.toString());
			}
		}
	}
}
