
import java.util.*;
class AAstatic
{
   
    public static void main(String args[])
    {       
        Scanner s =new Scanner(System.in);
        int a= s.nextInt();    
         try
         {
            if(a%2==0)
                System.out.println("Successful");
            else
                throw new ArithmeticException("Invalid number :");
         }
        catch(ArithmeticException e)
        {
             System.out.println("Caught my exception");
        }
     }
}