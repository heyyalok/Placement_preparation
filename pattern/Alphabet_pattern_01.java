public class Star_pattern_triangle_reverse
{
    public static void main(String[]args)
    {
        char i,j,k;
        for(i ='a';i<='e';i++)
        {
            for( j='d';j>=i;j--)
            {
                System.out.print(" ");
            }
            for( k='a';k<=i;k++)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
//output
//    a
//   ab
//  abc
// abcd
//abcde
