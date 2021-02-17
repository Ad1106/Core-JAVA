
class Calculation
{
	void sum(int a, int b)
	{
		System.out.println("Sum="+(a+b));
	}
	void sum(int a, int b , int c)
	{
		System.out.println("Sum="+(a+b+c));
	}
	
	public static void main(String args[])
	{
		Calculation t=new Calculation();
		t.sum(10,10,10);
		t.sum(2,3);
		
	}
}