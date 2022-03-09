import java.util.Scanner;
public class Reverse_string_using_function
{
    static String student_details(String name)
        {
            String reversed = "";
            int l = name.length();
            for (int i = l-1; i>=0 ;i--)
            {
                reversed = reversed+String.valueOf(name.charAt(i));
            }
            return reversed;
        }
        public static void main(String[]args)
        {
            Scanner scr = new Scanner(System.in);
            System.out.println("enter any string");
            String str = scr.nextLine();
            System.out.println(student_details(str));
        }
}
