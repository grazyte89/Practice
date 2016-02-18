package neverendsChapter19;

import java.util.ArrayList;
import java.util.List;


public class BasicUserNamerChecker {
	
	private String userName;
	
	public static void main(String [] args)
	{
		BasicUserNamerChecker mThread = new BasicUserNamerChecker();
		mThread.setUserName("meatsweat");
		mThread.checkNameThread();
	}
	
	private String getUserName()
	{
		return userName;
	}

	public void setUserName(String username) 
	{
		this.userName = username;
	}
	
	public void checkNameThread()
	{
		@SuppressWarnings("unused")
		AvailabiltyCheck availabiltyCheck = new AvailabiltyCheck();
	}
	
	public class AvailabiltyCheck extends Thread {

		private List<String> listOfUsedUserName = new ArrayList<String>();
		
		
		public AvailabiltyCheck() 
		{
			//
			this.initialiseTheList();
			start();
		}

		private void initialiseTheList() 
		{
			listOfUsedUserName.add("evian5");
			listOfUsedUserName.add("java74");
			listOfUsedUserName.add("meatsweat");
			listOfUsedUserName.add("isthesquiidsthick");
		}
		
		public void run()
		{
			for(String string: listOfUsedUserName) 
			{
				if(string.equalsIgnoreCase(getUserName())) 
				{
					System.out.println(userName + " has been taken. Please choose another");
				}
			}
		}
	}
}
