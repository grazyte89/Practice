package collectionsCollector;

import java.util.Scanner;

public class WhatisSet {
	
	private Scanner scanner = new Scanner(System.in);
	
	public WhatisSet()
	{
		//
	}
	
	public void activate()
	{
		menuWithSelectionOfSet(entryOfTypeOfValue());
	}
	
	private String entryOfTypeOfValue()
	{
		System.out.println("Enter the type of 'Set' you want");
		System.out.println("your options are: hashset, treeset or linkdedhashset");
		String input = scanner.next();
		return input;
	}
	
	private void menuWithSelectionOfSet(String key)
	{
		switch (key.toLowerCase()) 
		{
		case "hashset":
			System.out.println("I think it worked");
			break;

		default:
			break;
		}
	}
	
	
}
