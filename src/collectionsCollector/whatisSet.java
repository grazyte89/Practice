package collectionsCollector;

import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

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
			//Set<Integer> hashset = new HashSet<Integer>();
			//addValuesInto(hashset);
			//displayContent(hashset);
			Set<String> hashset = new HashSet<String>();
			addStringValuesInto(hashset);
			displayStringContent(hashset);
			break;
		case "treeset":
			break;
		case "linkedhashset":
			break;
		case "all":
			break;
		default:
			System.exit(0);
			break;
		}
	}
	
	private void addStringValuesInto(Set<String> theSetString)
	{
		for(int cycle = 0; cycle < 10; cycle++)
		{
			theSetString.add(String.valueOf(GibberishWordGenerator.randomWordGenerator()));
		}
	}
	
	@SuppressWarnings("unused")
	private void addIntegerValuesInto(Set<Integer> theSetCollection) 
	{
		for(int cyvleValue = 0; cyvleValue < 300; cyvleValue++)
		{
			theSetCollection.add(generateNumberValues(30));
		}	
	}
	
	@SuppressWarnings("unused")
	private <T extends Set<T>> HashSet<T> initialiseVlaue()
	{
		return null;
	}
	
	private void displayStringContent(Set<String> set)
	{
		for(String setValuein : set)
		{
			System.out.println(setValuein);
		}
	}
	
	@SuppressWarnings("unused")
	private void displayContent(Set<Integer> set)
	{
		for(Integer setValuein : set)
		{
			System.out.println(setValuein);
		}
	}
	
	private int generateNumberValues(int setLimit)
	{
		Random random = new Random();
		int numberValue = random.nextInt(setLimit) + 1;
		return numberValue;
	}
	
	public static char[] checkReturn(char [] a)
	{
		char[] temp = new char[a.length];
		for(int currentCycle = 0; currentCycle < a.length; currentCycle++)
		{
			temp[currentCycle] = Character.toUpperCase(a[currentCycle]);
		}
		return temp;
	}
}
