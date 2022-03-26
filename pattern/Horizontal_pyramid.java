//uisng Math.abs function;
public class Loop_pattern
{
    public static void main(String[]args)
    {
        int n = 5;
        for (int i = 3; i>= -3; i--)
        {
            for (int j = 3; j>= Math.abs(i); j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//without using abs function;
public class Loop_pattern
{
    public static void main(String[]args)
    {
        int n = 5;
        for (int i = 1; i<= n; i++)
        {
            for (int j = 1; j<= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n-1; i>= 1; i-- )
        {
            for (int j = i ; j>=1;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
//output
//*
//**
//***
//****
//***
//**
//*
