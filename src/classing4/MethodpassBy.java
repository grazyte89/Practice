package classing4;

public class MethodpassBy {

	public String  x;
	private int y;
	
	public MethodpassBy(String x, int y)
	{
		this.x = x;
		this.y = y;
	}

	public String getX()
	{
		return x;
	}

	public void setX(String x)
	{
		this.x = x;
	}

	public int getY()
	{
		return y;
	}

	public void setY(int y)
	{
		this.y = y;
	}
	
	public String toString()
	{
		return x + " " + y;
	}
}
