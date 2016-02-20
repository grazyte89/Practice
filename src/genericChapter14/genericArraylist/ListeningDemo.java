package genericChapter14.genericArraylist;

import java.util.ArrayList;
import java.util.List;

public class ListeningDemo {

	public static void main(String[] args) {
		
		ListingDynamic demi = new ListingDynamic();
		demi.start();
		
		Geno<String> objectGeneric = new Geno<String>("donkey", "kong");
		objectGeneric.show();
		
		List<Integer> data = new ArrayList<Integer>();
		
		ListingMaipulation maipulation = new ListingMaipulation();
		maipulation.addingNewData(10);
		System.out.println(maipulation.toString());
		maipulation.copyValueFromThisTo(data);
		if(maipulation.equals(data))
		{
			System.out.println("true");
		}
		maipulation.replaceAnIndexInList(6, 7542696);
		System.out.println(maipulation);
	}
}
