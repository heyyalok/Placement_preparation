public class Loop_pattern_03 {
    public static void main(String[]args)
    {
        for (int i= 0; i<3;i++)
        {
            for (int j =0;j<i;j++)
            {
                System.out.print(i+" "+j+", ");
            }
        }
    }
}
//output
//1 0, 2 0, 2 1,
