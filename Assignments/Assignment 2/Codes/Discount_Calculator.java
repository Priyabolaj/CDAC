import java.util.Scanner;

class Discount_Calculator 
{
	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

   	 	System.out.print("Enter the total purchase amount (Rs.): ");
        	double totalAmount = scanner.nextDouble();

                System.out.print("Do you have a membership card? (yes/no): ");
        	String membershipStatus = scanner.next();

        
        	double discountPercentage;
		int num;

		if(totalAmount>=100)
		{
			num = 1;
		}
		else if(totalAmount>=500 && totalAmount<=999)
		{
			num = 2;
		}
		else
		{
			num = 3;
		}
        	switch (num) 
		{
            		case 1: 
                		discountPercentage = 20;
                		break;
            		case 2: 
                		discountPercentage = 10;
                		break;
            		default: 
                		discountPercentage = 5;
                		break;
        	}

                if (membershipStatus.equals("yes")) 
		{
            		discountPercentage += 5;
        	}

        
        	System.out.printf("The discount for a total purchase of Rs. %.2f is %.2f%%%n", totalAmount, discountPercentage);

	}
}
