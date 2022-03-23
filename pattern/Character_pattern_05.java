public class Trial
{
    public static void main(String[]args)
    {
        char i,j;
        for (i='a';i<='e';i++)
        {
            for (j='e';j>=i;j--)
            {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
//aaaaa
//bbbb
//ccc
//dd
//e
