package flowcontrolChapter3;

public class NamedBreakLoop {

	public static void main(String[] args)
	{
		
		loop1: // here we are labelling loops, thus named-break can identify which loop to break out from
		for(int index1 = 0; index1 < 20; index1++)
		{
			loop2:
			for(int index2 = 0; index2 < 10; index2++)
			{
				if(index2 == index1 && index2 < 5)
				{
					System.out.println("breaking out of loop2");
					break loop2;
				}
				
				if(index2 == index1 && index2 == 7)
				{
					System.out.println("breaking out of loop1");
					break loop1; // using named-break, we can select which loop to break out of.
				}
			}
			
			System.out.println("in loop1");
		}
		
		System.out.println("outside loop1");
	}
}
