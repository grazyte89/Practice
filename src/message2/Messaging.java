package message2;

import java.util.Scanner;

public class Messaging {
	
	private static Scanner input1;

	public static void main(String[] args) {
		
		input1 = new Scanner(System.in);
		System.out.println("Enter line of text");
		String message1 = input1.nextLine();
		System.out.println(message1);
		
		if(message1.length() == 0)
		{
			System.out.println("You haven,t entered anything");
			System.out.println("Please enetr text");
			String message2 = input1.next();
			System.out.println(message2);
		}
		else if(message1.length() >= 1 )
		{
			System.out.println("You've enter some text, now write a line");
			String message3 = input1.nextLine();
			String message4 = input1.next();
			System.out.println(message3);
			System.out.println(message4);
		}
	}
	
	public boolean stringEmpty(String empty)
	{
		return empty.length() == 0;
		
	}
}
