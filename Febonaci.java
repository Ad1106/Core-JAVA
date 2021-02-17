class Febonaci {
    public static void main(String[] args) {
    	
    	int a=0 , b=1 ,c;
	System.out.println("Febonaci Series"+a +b);
	for (int i=0;i<10;i++)
		{
			c=a+b;
			a=b;
			b=c;	
			System.out.print(c+" ");
		}
	System.out.println("\nMy name is Adarsh shukla and Roll no. is 10");
    }
}