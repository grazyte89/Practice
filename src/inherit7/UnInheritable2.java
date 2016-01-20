package inherit7;

public class UnInheritable2 // extends UnInheritable1 cannot be inherited
{
	private String address;
	private UnInheritable1 un;
	
	public UnInheritable2(String address)
	{
		this.address = address;
		un = new UnInheritable1("leee");
	}

	public String getAddress()
	{
		return address;
	}

	public void setAddress(String address)
	{
		this.address = address;
	}

	public UnInheritable1 getUn()
	{
		return un;
	}

	public void setUn(UnInheritable1 un)
	{
		this.un = un;
	}
}
