public class While_loop_01 
{
    public static void main(String[]args)
    {
        int ctr=0;
        for (int i=1; i<= 5;i++)
        {
            for (int j=1; j<= 5;j+=2)
            {
                System.out.print(++ctr+" ");
            }
        }
    }
}
//output
//1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 
