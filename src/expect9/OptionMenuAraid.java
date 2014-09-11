package expect9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OptionMenuAraid {
	
	private Scanner input = new Scanner(System.in);
	
	private boolean optionstate = false;
	
	public OptionMenuAraid()
	{
		opmenuchoise();
		
	}
	
	private void opmenuchoise()
	{
		System.out.println("Enter the number between 1-3");
		
		while(!optionstate)
		{
			try
			{
				int tnumber = input.nextInt();
				if(tnumber < 0 || tnumber > 3)
				{
					mSend("The value is either to large or to small");
				}
				else if(tnumber > 0 && tnumber < 3)
				{
					opmenu(tnumber);
					optionstate = true;
				}
				else
				{
					throw new Exception("the value you entred is not the right one");
					/*
					 * this is how a throw is defined
					 */
				}
			}
			catch(InputMismatchException e)
			{
				System.out.println(e.getMessage());
				System.out.println("what you enetr was the wrong type of data");
				System.exit(0);
			}
			catch(OptionException1 e)
			{
				System.out.println(e.getMessage());
			}
			catch(Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	
	private void opmenu(int i)
	{
		switch(i)
		{
		case 1: 			
			System.out.println("you chose option one");
			break;
		case 2: 
			System.out.println("you chose option two");
			break;
		case 3:
			System.out.println("you chose option three");
			break;
		default:
			System.out.println("no choice");
			System.exit(0);
			break;
		}
	}
	
	private void mSend(String str) throws OptionException1
	{
		throw new OptionException1(str);
		/*
		 * this how you define a throw method
		 */
	}
}
