package hello1;

public class Hello {
	// different ways of initialising variables (basic)

	private static String hi = "hello";
	private static int number;
	private static boolean truth = true;
	
	public static void main(String[] args) {
		
		System.out.println(hi);
		System.out.println(truth);
		
		number = 5;
		System.out.println(number);
		
		int number2 = number;
		System.out.println((double)number2); //typecast int value into double
		
		int number3 = 1;
		number3 += 2;
		System.out.println(number3);
		
		int number4 = 1;
		number4 = number4 + 4;
		System.out.println(number4); // different way of doing number3
		
		while(truth)
		{
			if(number == 7)
			{
				truth = false;
			}
			number++;
		}
		
		System.out.println("number " + number);
	}
}
