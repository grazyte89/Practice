package anonymous_classChapter13;

/**
 * Created by Abu.
 */
public class AnonymousClass
{
    public static void main(String[] args)
    {
        /* Anonymous allows us to create temporary class by making our interface a class for short while.
         *
         */
        InterfaceforAnonymousclass number = new InterfaceforAnonymousclass()
        {
            private int number;

            @Override
            public void setNumber(int number)
            {
                this.number = number;
            }

            @Override
            public int getNumber()
            {
                return number;
            }
        };
        number.setNumber(45);
        System.out.println(number.getNumber());
    }
}
