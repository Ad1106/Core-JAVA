class MainOverhiding1
{
	public static void main(Object args)
	{
		System.out.println("Fun2");
    }
}
class MainOverhiding2 extends MainOverhiding1
{
	public static void main(String args[])
	{
		System.out.println("Fun1");
		MainOverhiding2 s= new MainOverhiding2();
		main(s);
	}
}