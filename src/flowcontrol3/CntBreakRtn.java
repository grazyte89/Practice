package flowcontrol3;

public class CntBreakRtn {
	
	public CntBreakRtn()
	{
		//
	}
	
	public void wayToReturn(boolean bool)
	{
		System.out.println("hello");
		if(bool)
		{
			// if the return is executed; this means, it will jump out of the method
			return;
		}
		
		System.out.println("lalalalalala");
		System.out.println("you");
		System.out.println("say");
		System.out.println("i'm");
		System.out.println("...");
	}
	
	public void wayToBreak()
	{
		System.out.println("What a break does in a loop");
		String stringValue = "break";
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("blah blah blah");
			
			if(i == 5 && stringValue.equals("break"))
			{
				System.out.println("the current iteration " + i);
				// reaching thispoint means, you'll break free from the loop
				break;
			}
		}
		
		System.out.println("...out of the loop");
	}
	
	public void wayToContinue()
	{
		System.out.println("How continue works in a loop");
		String stringValue = "yes";
		
		for(int i = 0; i < 10; i++)
		{
			System.out.println("This line is execute as normal");
			System.out.println("the value of current iteration " + i);
			
			if(i > 5 && stringValue.equals("yes"))
			{
				System.out.println("-----------------------------------------");
				System.out.println("we entered the continue dominion");
				System.out.println("This means that contine will force the loop to move to the next "
						+ "iteration. The remainder of the code within the loop will not not"
						+ " be executed");
				continue;
			}
			
			System.out.println("...means continue hasn't been executed");
		}
		System.out.println("... outs");
	}
	
	public void multiArrayContinue()
	{
		for(int a = 0; a < 10; a++)
		{
			for(int b = a - a; b < 10; b++)
			{
				if(b == a)
				{
					System.out.println("inner loop inner section, continue activate" + b);
					continue;
				}
				System.out.println("inner loop outer section" + b);
			}
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		CntBreakRtn cnt = new CntBreakRtn();
		cnt.wayToContinue();
		System.out.println("-------------------");
		
		CntBreakRtn brk = new CntBreakRtn();
		brk.wayToBreak();
		
		CntBreakRtn rtn = new CntBreakRtn();
		rtn.wayToReturn(true);
	}
}
