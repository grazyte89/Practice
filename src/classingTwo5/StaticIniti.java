package classingTwo5;

public class StaticIniti {

	private int number = 0;
	
	static
	{
		System.out.println("only get executed once");
		// static initialiser field is executed when the class is run.
		// static initialiser field is will only be executed once; even if it has multiple object of this
		// class, it will only run once. see SemoStaticini for demonstration.
	}

	public int getNumber() 
	{
		return number;
	}

	public void setNumber(int number) 
	{
		this.number = number;
	}
	
}
