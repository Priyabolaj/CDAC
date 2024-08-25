import java.util.Scanner;

class Student_status 
{
    	public static void main(String[] args) 
	{
        	Scanner scanner = new Scanner(System.in);

        	System.out.print("Enter grade for Subject 1: ");
        	int subject1 = scanner.nextInt();
        	System.out.print("Enter grade for Subject 2: ");
        	int subject2 = scanner.nextInt();
        	System.out.print("Enter grade for Subject 3: ");
        	int subject3 = scanner.nextInt();

        
        	int failedSubjects = 0;

        	if (subject1 <= 40) 
			failedSubjects++;
        	if (subject2 <= 40) 
			failedSubjects++;
        	if (subject3 <= 40) 
			failedSubjects++;

        	if (failedSubjects == 0) 
		{
            		System.out.println("Pass");
        	} 
		else 
		{
            		System.out.println("Fail - Number of subjects failed: " + failedSubjects);
        	}

        }
}
