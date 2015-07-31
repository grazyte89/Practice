package recur11and13;

public interface PowerInterface {
	
	public int powerf(int q, int m);
	
	/* An interface is a NOT a class, but it can be a data-type */
	
	/* An interface is like an abstract class in the sense that when a method is made abstract, what we telling java
	   is that we have made this abstract method as an undefined placeholder for now, but hope to define
	   later in one the child classes. */
	
	/* An interface a is place which just contains method heading, meaning just the first and top line of the
	   heading, and not body{} 
	   i.e public int powerf(int q, int m) */
	
	/* When an interface is connected to a class via implements i.e. public class Examp implements 
	   powerInterface; this force the Examp class to inherit and add the method into the child class */
}
