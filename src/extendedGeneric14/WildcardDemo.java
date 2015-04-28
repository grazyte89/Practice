package extendedGeneric14;

import inherit7.SecondBase;
import inherit7.ThirdBase;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

	public static void main(String[] args)
	{
		List<SecondBase> list1 = new ArrayList<SecondBase>();
		list1.add(new SecondBase());
		WildcardGeneric.upperBoundWildcard(list1);
		
		List<ThirdBase> list2 = new ArrayList<ThirdBase>();
		list2.add(new ThirdBase());
		// WildcardGeneric.lowerBoundWildcard(list2); // will not work, because <thirdbase> is a sub type of secondbase
		// and lowerBoundWildcard can only hold the base class (super class: firstbase) of secondbase
	}

}
