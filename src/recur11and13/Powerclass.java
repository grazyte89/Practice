package recur11and13;

public class Powerclass implements PowerInterface
{
	public String name;
	
	public static PowerInterface getdata(String name)
	{
		Powerclass p = new Powerclass();
		p.name = name;
		return p;
	}

	@Override
	public int powerf(int q, int m)
	{
		int i = q;
		
		for(int j = 0; j < m; j++)
		{
			i = i * i;
		}
		
		return i;
	}
	
	public String toString()
	{
		return name + "";
	}
}
