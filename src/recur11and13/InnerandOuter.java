package recur11and13;

public class InnerandOuter {
	
	private int mones = 10;
	
	public class Inclass {
		
		private int test = 45;
		
		private int dollar;
		private int cent;
		
		private Inclass(String amount)
		{
			abortnull(amount);
			intialiseval(amount);
		}
		
		private void abortnull(Object o)
		{
			if(o == null)
			{
				System.out.println("nothing was entered");
				System.exit(0);
			}
		}
		
		private boolean checkingValue(String value)
		{
			try
			{
				Double.parseDouble(value);
			}
			catch(Exception e)
			{
				return false;
			}
			return true;
		}
		
		private void intialiseval(String value)
		{
			if(checkingValue(value))
			{
				int lengthf = value.length();
				dollar = Integer.parseInt(value.substring(0, lengthf - 3));
				cent = Integer.parseInt(value.substring(lengthf - 2));
			}
			else
			{
				System.out.println("soeigcdn worng");
			}
		}
		
		private String getAmount()
		{
			if(cent > 9)
				return (dollar + "." + cent);
			else
				return (dollar + ".0" + cent);
		}
		
		private void addin(Inclass object)
		{
			abortnull(object);
			int newcnt = (cent + object.cent) % 100;
			int carry = (cent + object.cent) / 100;
			cent = newcnt;
			dollar = dollar + object.dollar + carry; 
		}
		
		private void display()
		{
			System.out.println(mones);
			//money = 0; 
		}
	}
	
	private Inclass balnce;
	
	public InnerandOuter()
	{
		balnce = new Inclass("0.00");
	}
	
	public String getbalance()
	{
		return balnce.getAmount();
	}
	
	public void makedeposit(String amount)
	{
		balnce.addin(new Inclass(amount));
	}
	
	public void closeaccount()
	{
		balnce.dollar = 0;
		balnce.cent = 0;
	}
	
	public void show()
	{
		
		Inclass i = new Inclass(null);
		i.display();
		System.out.println(i.test);
	}
}
