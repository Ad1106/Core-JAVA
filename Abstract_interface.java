/*interface Abstract_interface1
{
    public void pro1();
}
    
interface Abstract_interface2
{
    public void pro2();
}
class Abstract_interface implements Abstract_interface1,Abstract_interface2
{
    public void pro1()
    {
        System.out.println("Abstract_interface1");
    }
    public void pro2()
    {
        System.out.println("Abstract_interface2");
    }
    public static void main(String args[])
    {
        Abstract_interface t = new Abstract_interface();
        t.pro1();
        t.pro2();
        System.out.println("AD");
    }
}*/

abstract class Abstract_interface1
{
    public void pro1()
    {
        System.out.println("1");
    }
    abstract public void pro2();
}
abstract class Abstract_interface2
{
    public void pro3()
    {
        System.out.println("1");
    }
    abstract public void pro2();
}
class Abstract_interface extends Abstract_interface1, Abstract_interface2
{
    public void pro2()
    {
        System.out.println("2");
    }
    public static void main(String args[])
    {
        Abstract_interface t = new Abstract_interface();
        t.pro1();
        t.pro2();
        System.out.println("AD");
    }
}