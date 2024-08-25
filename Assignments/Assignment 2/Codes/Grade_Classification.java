import java.util.*;  
class Grade_Classification   
{  
	public static void main(String[] args)   
	{  
		int score;    
		Scanner sc = new Scanner(System.in);  
		System.out.print("Enter a scores: ");  
		score = sc.nextInt();
		char grade;

        	if (score >= 90) {
            		grade = 'A';
        	} 
	
		else if (score >= 80) 
		{
            		grade = 'B';
        	} 

		else if (score >= 70) 
		{
            		grade = 'C';
        	} 

		else if (score >= 60) 
		{
            		grade = 'D';
        	} 

		else 
		{
            		grade = 'F';
        	}

		switch (grade) 
		{
            		case 'A':
                		System.out.println("Grade: A");
                		break;
            		case 'B':
                		System.out.println("Grade: B");
                		break;
            		case 'C':
                		System.out.println("Grade: C");
                		break;
            		case 'D':
                		System.out.println("Grade: D");
                		break;
            		case 'F':
                		System.out.println("Grade: F");
                		break;
            		default:
                		System.out.println("Invalid grade");
                		break;
        	}
	}
}