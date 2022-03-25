public class loopcontrol 
{
public static void main(String[]args)
{
    int z  = 1;
    for (int i=1; i<= 4; i++)
    {
        for (int j = 3; j>= i; j--)
        {
            System.out.print(" ");
        }
       for (int k = z; k>= 1; k--)
       {
           System.out.print(k);
       } 
       z=z+2;
       System.out.println();
    }
}    
}
//output
//   1
//  321
// 54321
//7654321
