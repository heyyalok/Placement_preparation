public class Loop_output_07
{
public static void main(String[]args)
{
    int i =1;
    while(i<=10)
    {
        System.out.print(i);
        if (i==5)
            continue;
        i++;
    }
}    
}
//output
//1234555555555555555555555555555555555555555555555555infinity time 5
