public class Reverse_an_integer
{
    public static void main(String[]args)
    {
        int []array = {1,2,3,4,5,6,7};
        int l = array.length;
        for (int i = l-1; i>=0; i--)
        {
            System.out.print(array[i]+",");
        }
    }
}
