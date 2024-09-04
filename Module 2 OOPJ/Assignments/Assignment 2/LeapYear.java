import java.util.*;
class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year");		
		int year = sc.nextInt();
		int choice;
		if(year % 400 == 0)
		{
			choice = 1;
		}
		else if(year % 4 == 0 && year % 100 != 0)
		{
			choice = 1;
		}
		else
		{
			choice = 2;
		}
		switch(choice)
		{
			case 1:
				System.out.println(year + " is a leap year");
				break;
			case 2:
				System.out.println(year + " is not a leap year");
				break;
			default:
				System.out.println(year + " is not valid");
				break;
		}
	}
}