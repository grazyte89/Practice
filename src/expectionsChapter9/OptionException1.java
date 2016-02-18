package expectionsChapter9;

public class OptionException1 extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4076496833703307048L;

	public OptionException1()
	{
		super("Yo");
	}
	
	public OptionException1(String str)
	{
		super(str);
	}

}
