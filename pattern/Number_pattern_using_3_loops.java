public class Star_pattern_triangle_reverse
{
    public static void main(String[]args)
    {
        for(int i =1; i<= 5; i++)
        {
            for(int j = 4;j>=i;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
//output
//    1
//   22
//  333
// 4444
//55555
