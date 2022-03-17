package interview.questions;
import java.util.Scanner;
public class Palindrome_string
{
    public static void main(String[]args)
    {
        Scanner scr = new Scanner(System.in);
        System.out.println("input any string");
        String name = scr.nextLine();
        int n = name.length();
        String reversed = "";
        for (int i = n-1; i>=0 ; i--)
        {
            reversed = reversed+String.valueOf(name.charAt(i));
        }
        if(name == reversed)
        {
            System.out.println("this is palindrome string");
        }
        else
        {
            System.out.println("this is not palindrome string");
        }
    }
}
