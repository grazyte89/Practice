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
		
	}
}
