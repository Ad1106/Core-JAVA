/* abstract class syntex
abstract Class
{
	abstract fun1();                      // abstract function
	fub2();                                   //non abstract function         ['abstract' keyword is required]
}       
in this class we achieved 50% abstraction by abstract class    */	

// <abstract  class> <obj_name> = new <child class>                              //its valid

abstract class Bike
{
	abstract void run();
	void speed(){}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Overhidden method");
	}
	public static void main(String args[])
	{
		Bike obj=new Honda();
		obj.run();
	}
}