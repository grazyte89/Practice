package flowcontrolChapter3;

public class TernaryStuff {
	
	public void checkTenerary(String string)
	{
		String result = string.equals("hello") ? "yes" : "no";
		// Ternary operator is a shorter way of doing the if-else statement.
		// ? checks if the value from string.equal is true or false
		// yes : no are outcome of ?. The left will houses the preferred result, and the right house the
		// un-preferred
		System.out.println(result);
	}
}
