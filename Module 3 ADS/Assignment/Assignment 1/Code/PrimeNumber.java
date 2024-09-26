import java.util.*;
class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean isprime= true;
		System.out.print("Input: ");
		int num =sc.nextInt();
		System.out.print("Output: ");
		if(num < 2)
     		{
         		isprime = false;
     		}
    		 else
     		{
              	for(int i=2; i <= num/2; i++)
				{
             		if(num % i == 0)
             		{
                		 isprime = false;
                		 break;
             		}
         		}
     		}
		System.out.print(isprime);
	}
}
/*
Explanation:
1. If the number is lesser than 2.
2. If the number has any factors other than 1 and itself.
3. If either of the above two conditions are satisfied, the number is not a Prime.
*/