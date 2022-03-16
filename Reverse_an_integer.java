public class Reverse_integer
{
    public static void main(String[]args)
    {
        int number = 2987;
        int reversed =0;
         int reminder=0;
        for( int i =number; i> 0 ;i=i/10)
        {
             reminder= i%10;
            reversed = reversed*10+reminder;
        }
        System.out.println(reversed);
    }
}
