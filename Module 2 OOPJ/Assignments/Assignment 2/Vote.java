import java.util.*;
class Vote
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter age: ");
		int age = sc.nextInt();
		if(age>18)
		{
			System.out.println("A person is eligible to vote");
		}
		else
		{
			System.out.println("A person is not eligible to vote");
		}
	}
}