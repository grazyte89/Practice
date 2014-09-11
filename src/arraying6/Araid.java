package arraying6;

import java.util.Scanner;
import java.util.Random;

public class Araid {
	
	private String[] oneDim;
	private String[][] twoDim;
	// here we set up little clue to the program saying reserve a place in the memory for
	// many variables of the string array.
	
	private int [] powerf; 
	private int numberb;
	
	private int status;
	
	private Random rannum = new Random();
	private Scanner input = new Scanner(System.in);
	
	public Araid()
	{
		System.out.println("enter choise 1 or 2. 3 for power of");
		status = input.nextInt();
		swithchoice(status);
		if(status == 1)
		{
			System.out.println(oneDim.length);
		}
		else if(status == 2)
		{
			System.out.println(twoDim.length + " " + twoDim[0].length);
			//twoDim[0] means getting the length of the second dimension of the array
		}
		disply();
	}
	
	private void swithchoice(int i)
	{
		System.out.println("you entered " + i);
		
		switch(i)
		{
		case 1:
			
			System.out.println("enter number of index");
			int ond = input.nextInt();
			oneDim = new String[ond];
			// here we are initialising the variable, and giving it number of index; 
			break;
			
		case 2:
			
			System.out.println("enetr index numbers");
			int two1 = input.nextInt();
			System.out.println("next one");
			int two2 = input.nextInt();
			twoDim = new String[two1][two2];
			break;
			
		case 3:
			
			System.out.println("enetr the number ");
			numberb = input.nextInt();
			System.out.println("enter number of power of");
			int pwr1 = input.nextInt();
			powerf = new int[pwr1];
			break;
			
		default:
			System.out.println("error");
			break;
		}
	}
	
	private void fill()
	{
		if(status == 1)
		{
			for(int i = 0; i < oneDim.length; i++)
			{
				int onrndm = rannum.nextInt(100);
				oneDim[i] = Integer.toString(onrndm);
			}
		}
		
		if(status == 2)
		{
			for(int j = 0; j < twoDim.length; j++)
			{
				for(int z = 0; z < twoDim[0].length; z++)
				{
					int tworndm = rannum.nextInt(100);
					twoDim[j][z] = Integer.toString(tworndm);
				}
			}
		}
	}
	
	/*private void memall()
	{
		ffit = new int[oneDim.length];
		
		for(int i = 0; i < ffit.length; i++)
		{
			int rans = rannum.nextInt(100);
			ffit[i] = rans;
		}
	}*/
	
	private void calco()
	{
		for(int r = 1; r < powerf.length; r++)
		{
			numberb = numberb * 2;
		}
		System.out.println(numberb);
	}
	
	private void disply()
	{
		fill();
		
		System.out.println("the randon values that you got are:");
		
		if(status == 1)
		{
			for(int i = 0; i < oneDim.length; i++)
			{
				System.out.println(oneDim[i]);
			}
		}
		
		if(status == 2)
		{
			for(int a = 0; a < twoDim.length; a++)
			{
				System.out.println("bracket " + a + "...");
				for(int b = 0; b < twoDim[0].length; b++)
				{
					System.out.println(twoDim[a][b]);
				}
			}
		}
		
		if(status == 3)
		{
			calco();
		}
				
		/*memall();
		
		System.out.println("memory space allocation");
		
		for(int i = 0; i < ffit.length; i++)
		{
			System.out.println(ffit[i]);
		}*/
	}
	
}
