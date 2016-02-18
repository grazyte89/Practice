package classChapter4;

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
		
		MethodpassBy m3 = new MethodpassBy("Stacy", 25);
		MethodpassBy m4 = m3;
		System.out.println("\n" + "original value of object of m3\n" + m3);
		m4.setX("Linda");
		System.out.println("\n" + "value of m3 after changing the value of m4\n" + "m3: " +m3); // m3 and m4 point to the same location, so any changes to m4 will affect m3, and vice versa.
		
		MethodpassBy m5 = new MethodpassBy("Staple", 75);
		m3 = m5;
		System.out.println("\n"+ "the value of m3 after assigning the value of of object m5\n" + "m3: " + m3); 
		// m3 is pointing to a different object, which is the location to m5 object
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
