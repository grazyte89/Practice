package collectionsCollector;

import java.util.Scanner;

public class WhatsisMap {

	private Scanner input = new Scanner(System.in);
	
	public void firstBase()
	{
		optionsOfmap(inputOption());
	}
	
	private String inputOption()
	{
		System.out.println("Enter the type of map");
		System.out.println("hashmap, treemap and linkedhashmap");
		String inputValue = input.next();
		return inputValue;
	}
	
	private void optionsOfmap(String inputValue)
	{
		switch(inputValue.toLowerCase())
		{
		case "hashmap":
			System.out.println("you're her so what");
			break;
		default:
			System.exit(0);
			break;
		}
	}
}
