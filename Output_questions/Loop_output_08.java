public class Loop_iteration_01 
{//static int i;
    public static void main(String[]args)
    {
        outer:
       for(int i=1;i<=5;i++)
       {
           inner:
           for (int j = 1; j<= 5; j++)
           {
               if (i==1)
                   continue inner;
               System.out.print("+");
           }
       }
    }   
}
//output
//++++++++++++++++++++
