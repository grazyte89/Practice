package stuffwithGeneric;


public class DemoingtheGeneric {

	public static void main(String[] args) {
		
		PlaywithGeneric<String> client1 = new PlaywithGeneric<String>();
		PlaywithGeneric<String> client2 = new PlaywithGeneric<String>();
		
		client1.setFirstName("Lancel");
		client1.setLastName("Mahogany");
		
		client2.setFirstName("Jon");
		client2.setLastName("snow");
		
		if(client1.equals(client2)) 
		{
			System.out.println(client1 + " is the same as " + client2);
		}
		else
		{
			System.out.println(client1 + " is NOT the same as " + client2);
		}
		
	}
}
