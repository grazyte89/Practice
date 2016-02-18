package chapter2;

import java.util.Locale;
import java.util.Scanner;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class Printingformat {

	private static Scanner input;
	
	public static void main(String[] args) {
		
		input = new Scanner(System.in);
		
		System.out.println("enter value with 10 digits after the decimal place");
		double floatnumber = input.nextDouble();
		System.out.printf("$%6.3f%n", floatnumber);
		// 6 means a minimum of 6 character space has been allocated after the $.
		// 2 means that only 2 digits will appear after the decimal point.
		
		NumberFormat pounds = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("Using numberformat class for curency");
		System.out.println(pounds.format(floatnumber));
		
		DecimalFormat decimalformat = new DecimalFormat("00.000");
		String number = decimalformat.format(floatnumber);
		System.out.println("Using decimalformat class");
		System.out.println(number);
	}
}
