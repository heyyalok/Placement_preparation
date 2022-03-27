public class Loop_iteration_02
{
    public static void main(String[]args)
    {   outer:
        for (int i =0;i< 3;i++)
        {
            inner:
            for (int j = 0;j<3;j++)
            {
                if (i==j)
                    continue outer;
                System.out.print(i+" "+j+", ");
            }
        }
    }
}
//output
//1 0, 2 0, 2 1,
