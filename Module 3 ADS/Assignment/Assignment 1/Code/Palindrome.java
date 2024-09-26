import java.util.Scanner;

class Palindrome {
    public static boolean isPalindrome(int num) {
        if (num < 0) return false;
        int reversed = 0, ori = num;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return ori == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        int num = sc.nextInt();
        System.out.println("Output: "+isPalindrome(num));
    }
}
/*
Explanation:
1. Input: A number num
2. Reverse the digits of the number and compare with the original.
*/