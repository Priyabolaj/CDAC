class Factorial 
{
	public static void main(String[] args)
	{
		int n=10;
		int fact = 1;
		for(int i=n; i>1;i--)
			fact*=i;
		System.out.println("e factorial of the number 10: "+fact);
	}
}