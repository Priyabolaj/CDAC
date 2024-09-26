import java.util.*;
class LeapYear{
	static boolean check(int year){
		if(year % 400 == 0)
		{
			return true;
		}
		else if(year % 4 == 0 && year % 100 != 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year");		
		int year = sc.nextInt();
		System.out.println("Output: " + check(year));
		
	}
}
/*
Explanation:
1. take year as input.
2. Check if the year is divisible by 400 = leap year
3. Check if the year is divisible by 4 but not by 100 = leap year
4. Otherwise, it's not a leap year
*/