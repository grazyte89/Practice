package genericChapter14.genericInterface;

/**
 * Created by Abu on 20/02/2016.
 */
public class GenClass implements GenInterface<String, Integer>
{
    @Override
    public String getValue(Integer value)
    {
        return value.toString();
    }

    @Override
    public void valueTo(String value)
    {
        System.out.println(value);
    }
}
