package classChapter5;

public class Statisy {
	
	public static int count = -1;
	public static int lol = 1; // you can have static variable in non static methods 
	
	private String name;
	private int value;
	
	public Statisy()
	{
		System.out.println("No value returned");
	}
	
	public Statisy(String mane, int val)
	{
		this.name = mane;
		this.value = val;
	}
	
	public void setvalue(int i)
	{
		this.value = i;
	}
	
	public int getvalue()
	{
		return value;
	}
	public String toString()
	{
		return (name + " " + value + " ");
	}
	
	public boolean equals(Statisy og)
	{
		return (name.equals(og.name) && value == og.value);
	}
	
	public boolean lessvalue(Statisy og)
	{
		return (value < og.value);
	}
	
	public boolean morethan(Statisy og)
	{
		return (value > og.value);
	}
	
	public void loling()
	{
		lol = 50;
		System.out.println("loling " + lol);
	}
}
