package inheritenceChapter7;

import java.util.List;

public class SecondBase extends BaseNo{

	public String name;
	
	public SecondBase()
	{
		super(125L);
		/* if the super(125L) isn't added, then java will automatically behind the scene use the super() with no argument 
		 *  invoking the constructor at the base class.
		 * If a there is no parameterless BaseNo() constructor in the base class, then java will display a compiler error
		 */
		System.out.println("secondclass");
		setNumber(50);
		strings.add("second");
		//doingSomething();
	}

	public SecondBase(int number)
	{
		this(0, "word");
	}
	
	public SecondBase(int number, String word)
	{
		System.out.println("sebivkfldnvklf");
	}
	
	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}
	
	public List<String> getData()
	{
		return getDataFromList();
	}
	
	@SuppressWarnings("unused")
	private void priChange()
	{
		System.out.println("second base class, modifier should change");
		/* essentially this really wont get inherited, so we can make a new method with everything the same, 
		   and it will be considered a different method */
	}
	
	public void priCheckingSomething()
	{
		System.out.println("private seconf class checking " + 2);
	}
	
	public void pubCheckingSomething()
	{
		System.out.println("public second class checking ");
	}
	
	public void testSomething()
	{
		super.testSomething();
		//pubCheckingSomething();
	}
	
	public void doingSomething()
	{
		for(int i = 0; i < 5; i++)
		{
			addToListData("Data value " + i + " being executed in Second base seecccccoonndd");
		}
	}
}
