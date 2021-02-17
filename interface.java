import java.util.*;
interface B
{
B();

     default void show()
{
System.out.println("Show");
} 
}
class AB implements B
{
    public B()
    {
        System.out.println("B");
    }

  public void show()
{
 B.super.show();
System.out.println("DErived");
}
    public static void main(String args[])
    {
        AB t=new AB();
        t.show();
       
    }
}
