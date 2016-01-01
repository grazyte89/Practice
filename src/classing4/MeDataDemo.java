package classing4;

public class MeDataDemo {

	public static void main(String[] args) {
		
		MeData data1 = new MeData(25, 12, 2014);
		System.out.println(data1);
		
		MeData data2 = new MeData(11, 4, 2014);
		System.out.println(data2);
		
		System.out.println(data1.equals(data2));
		
		data2.setday(25);
		data2.setmonth("December");
		
		System.out.println(data1.equals(data2));
		System.out.println(data1);
		
		data2.getWord("by");
		data2.doingSomthing();
		
		System.out.println("data2 before: " + data2);
		
		MeData data3 = data2;
		data3.setmonth("February");
		
		System.out.println("data2 after: " + data2);
		
		/* You can see above that data3s' value is the object data2, and you can see that we change the month in 
		 * data3 to February. 
		 * To our suprise, we see that the month for data2 has changed as well. why is that?
		 */
	}
}
