package classChapter5;

/**
 * Created by Abu on 18/02/2016.
 */
public class MultipleClass
{
    private int number;

    public void setNumber(int number)
    {
        this.number = number;
    }

    public int getNumber()
    {
        return number;
    }
}

class AnotherClass
{
    private String name;

    public String getName()
    {
        return name;
    }

    public static void main()
    {
        MultipleClass multipleClass = new MultipleClass();
        multipleClass.setNumber(55);
        System.out.println(multipleClass);

        AnotherClass anotherClass = new AnotherClass();
        anotherClass.name = "john";
        System.out.println(anotherClass.name);
    }
}
