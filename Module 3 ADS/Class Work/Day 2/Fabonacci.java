class Fabonacci{
	static int fab(int n){
		if(n<=1)  //base condition
		{
			return n;
		}
		return fab(n-1)+fab(n-2);
	}
	public static void main(String args[])
	{
		int num=10;
		for(int i=0;i<num;i++)
		{
			System.out.print(fab(i)+" ");
		}
	}
}