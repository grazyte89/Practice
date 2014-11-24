package stuffwithGeneric;

public class MethodofGeneric {
	
	public static <T extends Comparable<T>> boolean compareTheObjects(PlaywithGeneric<T> generic, PlaywithGeneric<T> generic2) 
	{
		return (generic.equals(generic2));
	}
	
	public static <T> boolean isEquals(T object1, T object2)
	{
		return (object1.equals(object2));
	}
	
	/*public static <T> getData() 
	{
		return 
	}*/
}
