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
       for (int k = 1; k<= z; k++)
       {
           System.out.print(i);
       } 
       z=z+2;
       System.out.println();
    }
}    
}
//output
//   1
//  222
// 33333
//4444444
