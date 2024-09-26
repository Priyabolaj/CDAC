import java.util.*;
class Factorial{
	static int fact(int num){
		if(num<=1)
			return 1;
		return num*fact(num-1);	
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Input: ");
		int num = sc.nextInt();
		int fact = fact(num);
		System.out.println("Output: "+fact);
		
	}
}
/*Explanation: 
1. Call function fact(num)
2. Set base case when num<=1 return 1
3. Other cases return num * fact(num-1);
*/