package arraysChapter6;

/**
 * Created by Abu.
 */
public class MultiDimensional
{
    public int[][][][] fourD = new int[1][3][4][5];

    public MultiDimensional()
    {
        for(int q = 0; q < fourD.length; q++)
        {
            System.out.println("Inside the first dimension");
            for(int w = 0; w < fourD[0].length; w++)
            {
                System.out.println("Inside the second dimension");
                for(int e = 0; e < fourD[0][0].length; e++)
                {
                    System.out.println("Inside the third dimension");
                    for(int r = 0; r < fourD[0][0][0].length; r++)
                    {
                        System.out.println("Inside the fourth dimension");
                    }
                }
            }
        }
    }
}
