package genericChapter14.genericInterface;

/**
 * Created by Abu.
 */
public class GenClass implements GenInterface<String, Integer>, GenInterfaceTwo<String, Double>
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

    @Override
    public String getTypeForT() // --> the type-parameter changes from T to String
    {
        return new String();
    }

    @Override
    public Double getTypeForU()
    {
        return new Double("5");
    }
}
