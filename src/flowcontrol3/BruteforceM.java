package flowcontrol3;

import java.util.Random;
import java.util.Scanner;

public class BruteforceM {
	
	private static Random numberGen;
	private static Scanner inputin;

	public static void main(String[] args) {
		
		inputin = new Scanner(System.in);
		numberGen = new Random();
		
		System.out.println("choose one these options: brute, coin and twoloop");
		String option = inputin.next();
		
		switch(option)
		{
		
		case "twoloop":
			for(int i = 0, j = 1; i < 5 && j < 5; i++, j++)
			{
				System.out.println(i + " " + " " + j);
				
				if(i == 1 && j == 2)
				{
					break;
					// break only works for switch and loops
				}
			}
			break;
			
		case "brute":		
			
			int number1 = numberGen.nextInt(1000);
			
			int brute = 1;
			while(brute > 0)
			{
				System.out.println(brute);
				if(brute == number1)
				{
					System.out.println("code cracked");
					break;
				}
				else
				{
					brute++;
					continue;
				}
			}
			break;
			
		case "coin":
			int numb = 0;
			while(numb < 10)
			{
				int number2 = numberGen.nextInt(2);
				
				if(number2 == 1)
				{
					System.out.println("Heads:" + number2);
					numb++;
				}
				else
				{
					System.out.println("tails:" + number2);
					numb++;
				}
			}
			break;
			
		case "split":
			String value = "kvfkvjfdkkfbklfnbkf";
			for(char c: value.toCharArray())
			{
				System.out.println(c);
			}
			break;
			
		default:
			System.out.println("Error");
			break;
		}	
	}
}
