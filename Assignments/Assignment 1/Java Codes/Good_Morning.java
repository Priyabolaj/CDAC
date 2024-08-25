import java.util.*;

class Good_Morning 
{
    	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);	
        	System.out.print("Enter the time between (0-23): ");
        	int time = scanner.nextInt(); 

                if (time >= 5 && time < 12) 
		{
            		System.out.println("Good Morning!");
        	}
		else 
		{
            		System.out.println("It's not morning time.");
        	}
	}
}
