

import java.util.Scanner;   	

class Circle
{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
	int r = input.nextInt();

		double a,c;
		
		a=(Math.PI)*(r)*(r);
		c=(Math.PI)*(r)*(2);
		System.out.println("Area="+a);					System.out.println("C="+c);
	}
}