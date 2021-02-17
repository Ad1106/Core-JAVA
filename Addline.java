class Addline
{
	public static void main(String args[])
	{
		double a=Double.parseDouble(args[0]);
		double b=Double.parseDouble(args[1]);
		double c=a+b;
		System.out.println("Sum of a & b ="+c);		
	}
}

// Converting string to expression (because every value on command line is string and we want to do mathemetical operation : we can use Integer.parseInt