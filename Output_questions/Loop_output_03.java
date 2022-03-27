public class Loop_iteration_01 
  
    public static void main(String[]args)
    {
        for (int i=5;i>=0;i--)
        {
            System.out.print(--i*++i+",");
        }
    }   
}
//output
//20,12,6,2,0,0,
