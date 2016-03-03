package classChapter4;

import java.util.Scanner;

public class MeData {
	
	private String month; //instance variables()
	private int day;
	private int year;
	
	//private int salary;
	
	
	Scanner input = new Scanner(System.in);
	
	public MeData(int day, String month, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public MeData(int day, int month, int year)
	{
		this.month = monthCon(month);
		this.day = day;
		this.year = year;
	}
	
	public void setmonth(String name)// mutator
	{
		this.month = name;
		// the void means that it contains nothing to return, but rather it performs an action
	}
	
	public void setday(int day)
	{
		this.day = day;
		// this.age means the instant variable
	}
	
	public void setyear(int id)
	{
		this.year = id;
	}
	
	public String getmonth()// accessor method
	{
		return month;
		/* quick tip: accessor method(get method) can also perform actions, but here we made it to
		 * return values.
		 * 
		 * the scanner.nextLine is a return method which allows the the string variable to hold 
		 * the value of which is being returned.
		 */
	}
	
	public String monthCon(int nummonth)
	{
		switch(nummonth)
		{
			case 1:
				month = "January";
				return month;
			case 2:
				month = "February";
				return month;
			case 3:
				month = "March";
				return month;
			case 4:
				month = "April";
				return month;
			case 5:
				month = "May";
				return month;
			case 6:
				month = "June";
				return month;
			case 7:
				month = "July";
				return month;
			case 8:
				month = "August";
				return month;
			case 9:
				month = "September";
				return month;
			case 10:
				month = "October";
				return month;
			case 11:
				month = "November";
				return month;
			case 12:
				month = "December";
				return month;
			default:
				return "Error";
		}
	}

	public MeData getData()
	{
		return this;
	}

	public int getyear()
	{
		return year;
	}
	
	public int getDay()
	{
		return day;
	}
	
	public int multime(int ihour, int imin)
	{
		 return ihour*imin;
	}
	
	/*public void salall(int a, int b)
	{
		salary = multime(a, b);
	}
	
	public int endval()
	{
		return salary;
	}*/
	
	public void doingSomthing()
	{
		System.out.println(getWord("hello"));
	}
	
	public String getWord(String wod)
	{
		return wod;
	}
	
	public String toString()
	{
		return (day + " " + month + " " + year);
	}
	
	public boolean equals(MeData other)
	{
		return ( (month.equals(other.month)) && (day == other.day) && (year == other.year) );
	}
	
	public void displayMssge()
	{
		System.out.println(month +" "+ day + " " + year);
	}
}
