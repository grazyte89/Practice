package inheritenceChapter7;

public class DemoInh {

	public static void main(String[] args) {
		
		ThirdBase thirdBase = new ThirdBase();
		thirdBase.addData("ncdll");
		thirdBase.everyData();
		thirdBase.testSomething();
		
		BaseNo thirdbase2 = new ThirdBase();
		thirdbase2.addToListData("thib");
		// thib.addData("wont work");
		// thib.everyData();
		thirdbase2.doingSomething();
		System.out.println(thirdbase2.getDataFromList());
		//thirdbase2.testSomething();
		
		/* because we made our data type the base class and new created an object with with sub class, 
		 * we have limited our object. 
		 * This is because our object isn't calling methods from the right (new ThirdBase()), but rater from the left
		 * : the BaseNo class; what new is doing is just initialising the object
		 * Due to this, we have limited our object in the sense that the thirdbase2 object will not be able to use all the methods
		 * in the ThirdBase class, but instead it will only be able to call method they both share.   
		 */
		
		
		BaseNo pract = thirdBase;
		pract.addToListData("yo");
		pract.setNumber(1);
		pract.doingSomething();
		/* Here we don't have an object, instead we have a variable of a class type, which is reference the 
		 * thirdBase object.
		 * It shares the same limitation as mentioned above.
		 */
		
		System.out.println(pract.getDataFromList() + " pract ");
		/* Polymorphism is happening here, because we have a variable a varaible with BaseNo class type which is 
		 * referencing an object that is the subclass of BaseNo.
		 * Now we are in a dilemma, because they both contain the getDataFroList() method.
		 * So polymorphism comes in decides which version of the method is best suited in the occasion.
		 */
		
		//SecondBase secondBase = new SecondBase();
		//secondBase.addToListData("lalalalala");
		//System.out.println(secondBase.getDataFromList());
	}
}
