package flowcontrolChapter3;

import java.util.Scanner;

public class SwitchandCasIn {
	
	private static Scanner inputing;

	public static void main(String[] args) {
		
		inputing = new Scanner(System.in);
		
		double money1;
		double money2;
		
		System.out.println("Enter the value of money1");
		money1 = inputing.nextDouble();
		
		System.out.println("Now enter a currency sysmbol");
		String symbols = inputing.next();
		
		switch(symbols)
		{
		case "�":
			money2 = money1 * 1;
			System.out.println(money2);
			break;
		case "$":
			money2 = money1 * 2;
			System.out.println(money2);
			break;
		case "protocol8456":
			money2 = money1 * 100000000;
			System.out.println("you broke protocol8456");
			break;
		default:
			System.out.println("error");
			break;
		}
		
		System.out.println("enter loop value");
		int loopval = inputing.nextInt();
		
		while(loopval < 50)
		{
			System.out.println(loopval);
			loopval++;
			//break;
		}
	}
}
