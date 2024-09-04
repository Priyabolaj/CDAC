import java.util.*;
class BMI
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter weight");
		double weight = sc.nextDouble();
		System.out.println("Enter height");
		double height = sc.nextDouble();
		double bmi = weight / ( height * height );
		if(bmi < 18.5)
		{
			System.out.println(bmi+" Under Weight");
		}
		else if(bmi >= 18.5 && bmi < 24)
		{
			System.out.println(bmi+" Normal Weight");
		}
		else
		{
			System.out.println(bmi+" Over Weight");
		}
	}
}