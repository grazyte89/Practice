package extendedGeneric14;

import inherit7.SecondBase;

import java.util.ArrayList;
import java.util.List;

public class WildcardDemo {

	public static void main(String[] args)
	{
		List<SecondBase> list1 = new ArrayList<SecondBase>();
		list1.add(new SecondBase());
		WildcardGeneric.upperBoundWildcard(list1);
	}

}
