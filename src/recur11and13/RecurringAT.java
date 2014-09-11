package recur11and13;

public class RecurringAT implements PowerInterface {

	public static void main(String[] args) {
		
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
			System.out.println(n % 10);
		}
	}

	public int powerf(int q, int m) 
	{
		/*
		 * This how we define a recursive return method
		 */
		if(m < 0)
		{
			System.out.println("error");
			System.exit(0);
		}
		
		if(m > 0)
		{
			return (powerf(q, m -1) * q);
		}
		else
		{
			return (1);
		}
	}
}
