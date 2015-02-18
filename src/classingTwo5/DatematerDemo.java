package classingTwo5;

public class DatematerDemo {

	public static void main(String[] args) {
		
		Datesmater date1 = new Datesmater(12, 1, 2014);
		System.out.println(date1);
		
		Datesmater date2 = new Datesmater(date1);
		System.out.println(date2);
		
		System.out.println(date2.getValueOfClass() + " " + date1.getValueOfClass());
	}

}
