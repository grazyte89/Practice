package extendedGeneric14;

import inherit7.SecondBase;

import java.util.List;

public class WildcardGeneric {
	
	//private List<Integer> data;
	
	public WildcardGeneric()
	{
		
	}
	
	public static void upperBoundWildcard(List<? extends SecondBase> list)
	{
		
	}
	
	public <T extends SecondBase> void alternativeUpperBoundWildcard(List<T> list)
	{
		System.out.println("This is another way of writting the upperBoundWildcard method");
		System.out.println(list );
	}
	
	public static void lowerBoundWildcard(List<? super SecondBase> list)
	{
		System.out.println(list);
	}
}
