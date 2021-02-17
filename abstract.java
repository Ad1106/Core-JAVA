import java.util.*;

abstract class AB
{
    AB()
    {
        System.out.println("Constructor called");

    }
    void show()
    {
        System.out.println("Show");
    }
}
class CD extends AB
{
          public static void main(String args[])
    {
        CD t=new CD();
        t.show();
    }
}
