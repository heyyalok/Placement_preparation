public class Youtube_classes 
{
    public static void main(String[] args)
    {
        for (int i = 1; i<= 5; i++)
        {
            for(int j =1; j<= 5; j++)
            {
                if(i==j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print("o");
                }
            }
            System.out.println();
        }
        
    }
}
//output
//*oooo
//o*ooo
//oo*oo
//ooo*o
//oooo*
