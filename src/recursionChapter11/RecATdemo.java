package recursionChapter11;

import interfaceChapter13.PowerInterface;

public class RecATdemo {
	
	public PowerInterface powerInterface = new RecurringAT();

	public static void main(String[] args) 
	{
		
		RecurringAT oj = new RecurringAT();
		//oj.writevertical(1557);
		System.out.println(oj.powerf(2, 3));
		
		RecATdemo aTdemo = new RecATdemo();
		int i = aTdemo.powerInterface.powerf(2, 5);
		System.out.println(i);

	}

	public PowerInterface getPowerInterface() {
		return powerInterface;
	}

	public void setPowerInterface(PowerInterface powerInterface) {
		this.powerInterface = powerInterface;
	}
	
	public String toString()
	{
		return (" " + powerInterface);
	}
}
