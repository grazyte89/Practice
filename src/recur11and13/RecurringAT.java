package recur11and13;

public class RecurringAT implements PowerInterface {

	public static void main(String[] args) 
	{
		
		RecurringAT oj = new RecurringAT();
		oj.writevertical(1557);
		System.out.println(oj.powerf(2, 3));
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
}
