package genericArraylistChapter14;

public class Geno <T> {
	
	private T variable;
	private T variable2;
	
	public Geno(T val, T val2)
	{
		this.variable = val;
		this.variable2 = val2;
	}
	
	public void show()
	{
		System.out.println(getVa());
		System.out.println(variable2);
	}

	private T getVa()
	{
		return (variable);
	}
}
