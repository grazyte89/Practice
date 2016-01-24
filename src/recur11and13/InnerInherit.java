package recur11and13;

import polymo8.Animal;

public class InnerInherit
{
	private int speed;
	private Cat cat = new Cat();
	
	public int getSpd()
	{
		cat.setspeed();
		return speed;
	}
	
	private class Cat extends Animal // you inherit from the host class, a normal class and an inner class from a another class
	{

		@Override
		public int getspeed()
		{
			return speed;
		}

		@Override
		public void setspeed()
		{
			speed = 5;
		}
	}
}
