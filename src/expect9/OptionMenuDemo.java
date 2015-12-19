package expect9;

public class OptionMenuDemo {

	public static void main(String[] args) {
		
		OptionMenuAraid menuAraid = new OptionMenuAraid();
		
		try
		{
			System.out.println(menuAraid.getdisplay());
			/* we have enclose this method with try and catch, because we attached the method decalration with a 
			 * throws
			 */
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
