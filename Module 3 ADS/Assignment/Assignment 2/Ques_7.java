import java.util.*;
class Ques_7 {
	static int reverse(int number,int reverse)
	{
		while (number != 0) {
            int lastDigit = number % 10;
            
            reverse = reverse * 10 + lastDigit;

            number = number / 10;
        }
		return reverse;
	}
    public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();

        int reverse = 0;
        int originalNumber = number;  
        System.out.println("Reversed number: " +reverse(number,reverse) );
    }
}
