package flowcontrolChapter3;

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
					System.out.println("inner loop if section, continue activate " + b + " a: " + a);
					continue;
					/* using the continue statement meaning, if the continue statement is executed, then any other 
					   statements after that will not be executed, and will force the loop to iterate */
					
					/* when a continue statement is placed in a nested statement, and the continue statement is 
					   executed, it will NOT execute the statements after the continue statement within the 
					   same loop. But this action will not affect the statements in the outer loops, which are after 
					   the continue statement is executed.*/
				}
				System.out.println("inner loop outside if section" + b);
				System.out.println("i cc c"
						+ "\n dcdfv"
						+ "\ndc';d"
						+ "\ndpcdcl;d");
			}
			System.out.println("this place will still be executed even if continue id executed, because out continues"
					+ "reach");
		}
		System.out.println("");
	}
	
	public void multiArrayBreaking()
	{
		for(int a = 0; a < 10; a++)
		{
			for(int b = a - a; b < 10; b++)
			{
				if(b == a)
				{
					System.out.println("inner loop if section , break activate b " + b + "a: " + a);
					break;
					/* break, breaks out of the loop it is placed in. But if the break statement is place in a nested
					   inner loop, then it will break out of the inner loop and not the outer, you'll need another 
					   break statement in the outer loop come out of the loop */
					
					/* breaks out of the loop closest the break statement*/
				}
				System.out.println("inner loop outside if section" + b);
			}
			System.out.println("breaeking should be ar ths level " + a);
			/* break statement will not effect this loop(the outer loop), it only affects the first loop it comes 
			   into contact with */
		}
		System.out.println("outside the loops ");
	}
	
	public static void main(String[] args) {
		/*CntBreakRtn cnt = new CntBreakRtn();
		cnt.wayToContinue();
		System.out.println("-------------------");
		
		CntBreakRtn brk = new CntBreakRtn();
		brk.wayToBreak();*/
		
		CntBreakRtn rtn = new CntBreakRtn();
		//rtn.wayToReturn(true);
		
		rtn.multiArrayContinue();
		//rtn.multiArrayBreaking();
	}
}
