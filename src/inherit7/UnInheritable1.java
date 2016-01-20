package inherit7;

public final class UnInheritable1 // putting final on a class, means this class cannot be inherited by sub-class.
{
	private String name;
	private int age;
	
	public UnInheritable1(String name)
	{
		this.name = name;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		this.age = age;
	}
}
