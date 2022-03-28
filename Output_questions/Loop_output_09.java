public class While_loop_01 {
    public static void main(String[]args)
    {
        int i = 1;
        while(i<=5)
            {
                System.out.print(i);
                if(i==1)
                continue;
                i++;
            }
    }
}
//output
//11111111111111111111111111111111infinity times
