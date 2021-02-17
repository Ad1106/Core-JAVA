import java.util.*;
interface B
{
      default void show()                                                 // we can use static or instance block also
     {
	System.out.println("ShoW");
     } 
}
class AB implements B
{
  	public void show()
	{
		 B.super.show();
		System.out.println("Derived");
	}
    	public static void main(String args[])
                {
        		 AB t=new AB();
       		 t.show();
	 }
}
