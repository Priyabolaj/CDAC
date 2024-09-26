import java.util.Scanner;

public class ArmstrongNumber {
    public static boolean isArmstrong(int num) {
        int original = num, result = 0;
        int n = String.valueOf(num).length();

        while (num != 0) {
            int digit = num % 10;
            result += Math.pow(digit, n);
            num /= 10;
        }

        return result == original;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }
}
/*
Explanation:

1. Input: A number num
2. Find the number of digits n
3. For each digit, raise it to the power n and sum the values
4. If the sum equals the original number, it is an Armstrong number.
*/

