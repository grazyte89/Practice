package classingTwo5;

public class SemoStaticini {

	public static void main(String[] args) {
		
		StaticIniti initi = new StaticIniti();
		initi.setNumber(45);
		System.out.println(initi.getNumber());
		
		StaticIniti initi2 = new StaticIniti();
		initi2.setNumber(789);
		System.out.println(initi2.getNumber());
	}
}
