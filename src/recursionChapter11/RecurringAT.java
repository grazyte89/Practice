package recursionChapter11;

import interfaceChapter13.PowerInterface;

import java.util.ArrayList;
import java.util.List;

public class RecurringAT implements PowerInterface
{

	public static void main(String[] args) 
	{
		
		RecurringAT oj = new RecurringAT();
		oj.writevertical(1557);
		System.out.println(oj.powerf(2, 3));
		List<String> list = new ArrayList<String>();
		addlist(list);
		System.out.println(list);
		combinationBreaker("", "oylwel");
	}

	private void writevertical(int n)
	{
		if(n < 10)
		{
			System.out.println(n);
		}
		else
		{
			writevertical(n / 10);
			System.out.println(n % 10 + "java");
		}
	}

	public int powerf(int number, int powerValue) 
	{
		/*
		 * This how we define a recursive return method
		 */
		if(powerValue < 0)
		{
			System.out.println("error");
			System.exit(0);
		}
		
		if(powerValue > 0)
		{
			return (powerf(number, powerValue -1) * number);
		}
		else
		{
			return (1);
		}
	}
	
	public static void addlist(List<String> list)
	{
		if(list.size() < 5)
		{
			list.add("hello");
			addlist(list);
		}
	}
	
	public static void combinationBreaker(String prefix, String string)
	{
		int length = string.length();
		
		if(length == 0 )
		{
			if(prefix.equals("yellow"))
			{
				System.out.println(prefix);
			}
		}
		else
		{
			for(int index = 0; index < string.length(); index++)
			{
				combinationBreaker(prefix + string.charAt(index)
						,string.substring(0, index) + string.substring(index + 1, length));
			}
		}
	}
}
