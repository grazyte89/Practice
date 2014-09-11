package genericArraylist14;

public class ListeningDemo {

	public static void main(String[] args) {
		
		ListingDynamic demi = new ListingDynamic();
		demi.start();
		
		Geno<String> objectGeneric = new Geno<String>("donkey", "kong");
		objectGeneric.show();
	}
}
