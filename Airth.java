// WAP that show airthemetic operation ( using scanner class)

import java.util.Scanner;
class Airth {
    public static void main(String[] args) {
    	
    	double add,sub,mul,div;
	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter two numbers ");
    	double a = input.nextInt();
	double b = input.nextInt();
	add=a+b;
	sub=a-b;
	mul=a*b;
	//if(b!=0)
	   //div=a/b;
	System.out.println("Addition="+add);
	System.out.println("Subtraction="+sub);
	System.out.println("Multiplication="+mul);
	//System.out.println("Division="+d);
	}
}



