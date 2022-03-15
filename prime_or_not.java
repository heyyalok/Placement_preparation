package placement.questions;
import java.util.Scanner;
public class Prime_or_not
{
    public static void main(String[]args)
    {
        Scanner scr= new Scanner(System.in);
        System.out.println("for what number you want to check weather the given number is prime or not");
        int n = scr.nextInt();
        int temp =0;
     for (int i = 2; i<n-1; i++)
     {
         if (n % i ==0)
         {
             temp = temp +1;
         }
     }
         if(temp>1)
         {
             System.out.println("this is prime");
         }
         else
         {
             System.out.println("this is not prime");
         }
    }
}
