package advanceOperator2;

public class OperatorAdvance {
	
	public static int xorOperatorEx(int[] a)
	{
		  int result = 0; 
	      for(int i = 0; i < a.length; i++)
	      {
	          result = result ^a[i];
	          System.out.println(result);
	      }
	      return result;
	}

}
