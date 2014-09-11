package polymo8;

public class Anidemo {

	public static void main(String[] args) {
		
		Animal pet1 = new Cats("dookie", "bread", "persian", 10);
		dispalyi(pet1);
		
		Animal sal;
		Cats cal = new Cats("dale", "mango", "elvish cat", 25);
		sal = cal;
		System.out.println(sal.toString());
		// this is up-casting
		
		System.out.println("");
		dispalyi(cal);
	}
	
	public static void dispalyi(Animal oj)
	{
		System.out.println(oj.getname());
		System.out.println(oj.getfood());
		
		// Here the polymorphism is happening
		oj.movement();
		/*
		 * movement in base class animal and cat class have different definition. 
		 * so why is the out of the cat version movement used?
		 * 
		 * because we are using late binding, meaning java leaves the movement method to be
		 * executed during run time, as it knows there are more than one definition in the 
		 * family tree.
		 * 
		 * 
		 */
		// normal methods use the late binding approach, because they activated during the
		// run-time stage(execution)
		oj.speedmo();
		
		Cats tabs = (Cats)oj;
		System.out.println(tabs.getbreed());
	}
}
