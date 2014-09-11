package flowcontrol3;

import java.util.Scanner;

public class Nameregister {
	
	private static Scanner input;

	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("choose from option: lexcompare, name and do");
		String option = input.next();
		
		switch(option)
		{
		
		case "lexcompare":
			System.out.println("enter two names");
			String name1 = input.next();
			String name2 = input.next();
			
			if(name1.compareTo(name2) < 0)
			{
				int result = name1.compareTo(name2);
				/*
				 * compares each character and checks if it's in-order according to ASCI ii.
				 * return a negative value less the zero, if all character in name1 came before
				 * name2.
				 * otherwise returns a positive value that is equal or more than zero, if any
				 * character in name2 comes before name1. 
				 */
				System.out.println(result);
				System.out.println("name1 comes before name2, if placed in an ordering sequence");
			}
			else
			{
				System.out.println("name2 comes before name1, if placed in an ordering sequence");
			}
			break;
			
		case "name":
			
			System.out.println("enter number of students");
			int numberofstudent = input.nextInt();
			
			String[] list = new String[numberofstudent];
			
			for(int i = 0; i < numberofstudent; i++)
			{
				list[i] = input.next();
			}
				
			int whint = 0;
			while(whint < list.length)
			{
				System.out.println(list[whint]);
				whint++;
			}
			break;
			
		case "do":
			int doing = 0;
			do
			{
				System.out.println(doing);
				// execute do first, then goes to the loop mechanism
				doing++;
			}
			while(doing > 5);
			break;
			
		default:
			System.out.println("Error");
			break;
		}
		
	}
}
