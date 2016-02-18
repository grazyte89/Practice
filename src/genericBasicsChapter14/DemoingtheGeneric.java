package genericBasicsChapter14;


public class DemoingtheGeneric {

	public static void main(String[] args) {
		
		PlaywithGeneric<String> client1 = new PlaywithGeneric<String>();
		PlaywithGeneric<String> client2 = new PlaywithGeneric<String>();
		PlaywithGeneric<String> client3 = new PlaywithGeneric<String>();
		PlaywithGeneric<Integer> client4 = new PlaywithGeneric<Integer>();
		
		client1.setFirstName("Lancel");
		client1.setLastName("Mahogany");
		
		client2.setFirstName("Jon");
		client2.setLastName("snow");
		
		client3.setFirstName("Jon");
		client3.setLastName("snow");
		
		client4.setFirstName(45);
		client4.setLastName(75);
		
		if(MethodofGeneric.compareTheObjects(client2, client3)) 
		{
			System.out.println(client2 + " is the same as " + client3);
		}
		
		if(client2.equals(client3))
		{
			System.out.println("It works here");
		}
		
		if(MethodofGeneric.<String>compareTheObjects(client2, client3))
		{
			System.out.println("another way of using the generic method");
		}	
		else
		{
			System.out.println("The type of data help by the object" + client1 + " " + client2 + " " //
					+ client4);
		}
		
	}
}
