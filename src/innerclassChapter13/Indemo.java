package innerclassChapter13;

import interfaceChapter13.PowerInterface;
import recursionChapter11.Powerclass;

public class Indemo {

	public static void main(String[] args) {
		
		System.out.println("create account");
		InnerandOuter account = new InnerandOuter();
		System.out.println(account.getbalance());
		
		System.out.println(" ");
		account.makedeposit("100.00");
		System.out.println(account.getbalance());
		
		// make an object of inner class
		/* InnerandOuter.Inclass inClass = new InnerandOuter().new Inclass();  */
		
		// InnerInherit.Cat inhir = new InnerInherit().new Cat();
		InnerInherit in = new InnerInherit();
		System.out.println("speed " + in.getSpd());
		
		PowerInterface po = Powerclass.getdata("hello");
		System.out.println(po);
	}
}
