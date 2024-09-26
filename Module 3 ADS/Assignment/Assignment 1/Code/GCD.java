import java.util.*;

public class GCD {
    static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(gcd(a, b));
    }
}
/*Explanation:
1. Take two numbers a and b
2. Use the formula where GCD(a, b) = GCD(b, a % b) until b becomes 0.
*/