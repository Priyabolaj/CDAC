import java.util.*;
class Shape
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number \n 1. Circle \n 2. Square \n 3. Rectangle \n 4. Triangle: ");
		int shapeNo = sc.nextInt();
		double result;
		switch(shapeNo)
		{
			case 1:
				System.out.print("Enter radius: ");
				int radius = sc.nextInt();
				result = (double)3.14 * radius * radius;
				System.out.println("Area of Circle: "+ result);
				break;
			case 2:
				System.out.print("Enter side: ");
				int side = sc.nextInt();
				result = side * side;
				System.out.println("Area of Square: "+ result);
				break; 
			case 3:
				System.out.print("Enter length and width: ");
				int length = sc.nextInt();
				int width = sc.nextInt();
				result = length * width;
				System.out.println("Area of Rectangle: "+ result);
				break;
			case 4:
				System.out.print("Enter base and height: ");
				int base = sc.nextInt();
				int height = sc.nextInt();
				result = (double)0.5 * base * height;
				System.out.println("Area of Circle: "+ result);
				break;
			default:
				System.out.println("Invalid Shape");
				break;
		}
	}
}