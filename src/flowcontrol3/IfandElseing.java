package flowcontrol3;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class IfandElseing {
	
	private static Scanner inputin;

	public static void main(String[] args) {
		
		inputin = new Scanner(System.in);
		
		String stingValue = inputin.next();
		TernaryStuff stuff = new TernaryStuff();
		stuff.checkTenerary(stingValue);
		
		int tax;
		double total = 0;
		
		System.out.println("Enter you wages");
		double value = inputin.nextDouble();
		
		if(value < 10000)
		{
			tax = 0;
			total = value;
		}
		else if(value > 10000 && value < 20000)
		{
			tax = 5;
			total = ((value / 100 ) * 5); 
		}
		else
		{
			tax = 10;
			total = ((value / 100 ) * 10);
		}
		
		NumberFormat pounds = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("Tax rate is at " + tax + " and we're taking " + pounds.format(total));
		
		System.out.println("Now enter age");
		int value2 = inputin.nextInt();
		
		if(value < 10000)
		{
			if(value2 > 50 && value2 < 60)
			{
				System.out.println("you can receive £1000 support from government");
			}
			else if(value2 > 50 && value2 < 70)
			{
				System.out.println("you can receive £2000 support from gavornmnet");
			}
			else if(value2 > 50 && value2 < 80)
			{
				System.out.println("You can receive £3000 support from the gavornment");
			}
		}
		else if (value > 10000 && value < 20000)
		{
			if(value2 > 50 && value2 < 60)
			{
				System.out.println("you can receive £500 support from government");
			}
			else if(value2 > 50 && value2 < 70)
			{
				System.out.println("you can receive £1000 support from gavornmnet");
			}
			else if(value2 > 50 && value2 < 80)
			{
				System.out.println("You can receive £1500 support from the gavornment");
			}
		}
		else
		{
			System.out.println("Your not eligable");
		}
	}
}
