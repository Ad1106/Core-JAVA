import java.math.*;
import java.util.Scanner;

public class BigDecimal_prime 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a BigDecimal number to check");
		String n = scanner.nextLine();
		BigDecimal bd=new BigDecimal(n);
		int b=0;
		BigDecimal i=new BigDecimal("1");
		BigDecimal j=new BigDecimal("1");
		BigDecimal k=new BigDecimal("0");
		for(;i.compareTo(bd)!=0;i=i.add(j))
		{
			BigDecimal r=bd.remainder(i);
			if(r.compareTo(k)==0)
				b++;
		}
		if(b==1)
			System.out.println("Given number is prime");
		else
			System.out.println("Given number is not prime");
    }
	
}
