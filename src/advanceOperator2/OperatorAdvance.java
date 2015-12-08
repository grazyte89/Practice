package advanceOperator2;

public class OperatorAdvance {
	
	public static int xorOperatorEx(int[] a)
	{
		  int result = 0; 
	      for(int i = 0; i < a.length; i++)
	      {
	          result = result ^a[i];
	          /* what bitwise is going to do, is convert the number to binary, and then compare each bit. e.g.
	           * it compares each bit, and returns if one of the bits are 1; but return 0, if both are zero or one.
	           * So it returns a false if both the input to the 'XOR' operator are the same.
	            *   00001011 = 11
			    * 	00001100 = 12
				*	  = 00000111 = 7
				*	  
				*	 00000111 = 7// result
				*	 00001011 = 11
				*	  =00001100 = 12
				*	
				*	 00001100 = 12// result
				*	 00001101 = 13
				*	  =00000001 = 1
				*	  
				*	 00000001 = 1// result
				*	 00001110 = 14
				*	  =00001111 = 15 
				*	 
				*	 00001111 = 15// result
				*	 00001110 = 14
				*	  =00000001 = 1
				*	
				*	 00000001 = 1// result
				*	 00001100 = 12
				*	  =00001101 = 13
	           */
	          System.out.println(result);
	      }
	      return result;
	}

	public static void main(String[] args)
	{
		System.out.println(1012 % 1);
		String hi = "yo";
		if("hello".equals("hello") && hi.equals("yo"))
		{
			System.out.println("yeah");
		}
		System.out.println( 11 ^ 12);
		int[] array = {11, 12, 11, 13, 14, 14, 12};
		System.out.println(xorOperatorEx(array));
	}
}
