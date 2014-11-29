package collectionsCollector;

public class DemoingTheCollection {

	public static void main(String[] args) {
		WhatisSet whatisSet = new WhatisSet();
		whatisSet.activate();
		System.out.println(WhatisSet.checkReturn("hello".toCharArray()));
	}
}
