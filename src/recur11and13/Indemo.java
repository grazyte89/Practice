package recur11and13;

public class Indemo {

	public static void main(String[] args) {
		
		System.out.println("create account");
		InnerandOuter account = new InnerandOuter();
		System.out.println(account.getbalance());
		
		System.out.println(" ");
		account.makedeposit("100.00");
		System.out.println(account.getbalance());
		
		// make an object of inner class
		
		/* InnerandOuter.Inclass inClass = new InnerandOuterclass().new Inclass();  */
	}
}
