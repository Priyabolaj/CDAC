import java.util.*;
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
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: n= ");
		int num = sc.nextInt();
		System.out.print("Output: [ ");
		for(int i=0;i<num;i++)
		{
			System.out.print(fab(i)+" ");
		}
		System.out.print(" ]");
	}
}

/*
Explanation: 
1. The fab() function calculates Fibonacci numbers using recursion.
2. The program asks the user to enter a number (num).
3. It then prints the first num Fibonacci numbers using a loop.
4. The output is displayed in square brackets.
*/