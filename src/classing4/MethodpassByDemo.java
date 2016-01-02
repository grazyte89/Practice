package classing4;

public class MethodpassByDemo {

	public static void main(String[] args)
	{
		MethodpassBy m1 = new MethodpassBy("Mary", 24);
		MethodpassBy m2 = new MethodpassBy("Bran", 147);
		
		System.out.println("m1: " + m1 + "\n" + "m2: " + m2);
		
		passByValue(m1.getX(), m2.getY());
		
		System.out.println("\n" + "after passByvalue method\n" + "m1: " + m1 + "\n" + "m2: " + m2);
		
		passByValueObject(m1, m2);
		
		System.out.println("\n" + "after passByValueObject\n" + "m1: " + m1 + "\n" + "m2: " + m2);
	}

	public static void passByValue(String x, int y)
	{
		x = "bababab";
		y = 2000;
	}
	
	public static void passByValueObject(MethodpassBy mi, MethodpassBy m2)
	{
		//mi.setX(753);
		mi.x = "Kronnna";
		mi.setY(159);
		m2 = mi; 
		// http://www.programmerinterview.com/index.php/java-questions/does-java-pass-by-reference-or-by-value/
	}
}
