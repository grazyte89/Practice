package collectionsCollector;

public class DemoingTheCollection {

	public static void main(String[] args) {
		//WhattisSet whatisSet = new WhattisSet();
		//whatisSet.activate();
		//System.out.println(WhattisSet.checkReturn("hello".toCharArray()));
		
		WhatisList whatisList = new WhatisList();
		whatisList.executionlPoint();
		
		//WhatsisMap map = new WhatsisMap();
		//map.firstBase();
		
		if(whatisList instanceof Object)
		{
			System.out.println("yes");
		}
	}
}
