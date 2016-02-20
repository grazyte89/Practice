package genericChapter14.genericArraylist;

import java.util.ArrayList;
import java.util.List;

public class ListingMaipulation {

	private List<Integer> numberOfIntegers = new ArrayList<Integer>();

	public ListingMaipulation()
	{

	}

	public void addingNewData(int numberInt)
	{
		for (int index = 0; index < numberInt; index++)
		{
			getNumberOfIntegers().add(index);
			// Adding data to a list
		}
	}

	public void addToExistingList(int index, int value)
	{
		getNumberOfIntegers().add(index, value);
		// Adding data to an existing list.
		// The previous data is NOT replace, instead it just move the previous
		// index that is occupying that space one up. e.g.
		
		// 1 -> 2 -> 3 -> 4 -> 5 add() = size() = 5
		// 1 -> 2 -> 159 -> 3 -> 4 -> 5 add(2, 159) = size = 6
	}

	public void replaceAnIndexInList(int index, int value)
	{
		getNumberOfIntegers().set(index, value);
		// This current index with a new value
	}

	public List<Integer> getNumberOfIntegers()
	{
		return numberOfIntegers;
	}

	public void setNumberOfIntegers(List<Integer> numberOfIntegers)
	{
		this.numberOfIntegers = numberOfIntegers;
	}
	
	public String toString()
	{
		return (numberOfIntegers + "");
	}
	
	public void copyValueFromThisTo(List<Integer> list)
	{
		for(Integer integer : numberOfIntegers)
		{
			list.add(integer);
		}
	}
	
	public boolean equals(List<Integer> object)
	{
		if(numberOfIntegers.equals(object))
		{
			return true;
		}
		return false;
	}
}
