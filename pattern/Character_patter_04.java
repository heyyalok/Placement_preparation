public class Trial
{
    public static void main(String[]args)
    {
        char i,j;
        for (i='a';i<='e';i++)
        {
            for (j='e';j>=i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
//edcba
//edcb
//edc
//ed
//e
