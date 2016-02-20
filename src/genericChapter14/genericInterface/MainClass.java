package genericChapter14.genericInterface;

/**
 * Created by Abu on 20/02/2016.
 */
public class MainClass
{
    public static void main(String[] args)
    {
        String number = "155";
        GenClass gc = new GenClass();
        gc.valueTo(gc.getValue(Integer.parseInt(number)));
    }
}
