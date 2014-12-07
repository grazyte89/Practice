package collectionsCollector;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WhatisSet {
	
	private Scanner scanner = new Scanner(System.in);

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
			System.out.println("You're here at the hashset");
			Set<String> hashset = new HashSet<String>();
			addStringValuesInto(hashset);
			displayStringContent(hashset);
			break;
		case "treeset":
			System.out.println("You're here at the treeset");
			Set<Integer> treeset = new TreeSet<Integer>();
			addIntegerValuesInto(treeset);
			displayContent(treeset);
			break;
		case "linkedhashset":
			System.out.println("You're here at the linkedhashset");
			Set<Integer> linkedHashset = new LinkedHashSet<Integer>();
			addIntegerValuesInto(linkedHashset);
			displayContent(linkedHashset);
			break;
		case "all":
			this.menuWithSelectionOfSet("hashset");
			this.menuWithSelectionOfSet("treeset");
			this.menuWithSelectionOfSet("linkedhashset");
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
	
	private void addIntegerValuesInto(Set<Integer> theSetCollection) 
	{
		for(int cyvleValue = 0; cyvleValue < 300; cyvleValue++)
		{
			int value = generateNumberValues(30);
			theSetCollection.add(generateNumberValues(30));
			theSetCollection.add(value);
			theSetCollection.add(value);
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
