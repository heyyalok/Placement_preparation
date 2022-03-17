package interview.questions;
import java.util.Scanner;
public class Palindrome_No
{
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("input any integer to check weather it is palindrome or not");
        int n = scr.nextInt();
        int reminder = 0;
        int reverse = 0;
        for (int i = n ; i>0; i=i/10)
        {
            reminder = i%10;
            reverse = reverse*10+reminder;
        }
        if (n== reverse)
        {
            System.out.println("this is palindrome");
        }
        else
        {
            System.out.println("this is not palindrome");
        }
    }
}
