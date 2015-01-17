package inherit7;

public class DemoInh {

	public static void main(String[] args) {
		ThirdBase thirdBase = new ThirdBase();
		thirdBase.addData("ncdll");
		thirdBase.everyData();
		
		SecondBase secondBase = new SecondBase();
		secondBase.addToListData("lalalalala");
		System.out.println(secondBase.getDataFromList());
	}
}
