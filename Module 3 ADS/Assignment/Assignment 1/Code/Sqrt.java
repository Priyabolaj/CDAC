import java.util.*;
class Sqrt {
    static int sqrt(int x)
    {
        if (x == 0 || x == 1)
            return x;

        int i = 1, result = 1;

        while (result <= x) {
            i++;
            result = i * i;
        }
        return i - 1;
    }

    public static void main(String[] args)
    {
		Scanner sc = new Scanner(System.in);
		System.out.print("x: ");
        int x = sc.nextInt();
        System.out.println("Output: "+sqrt(x));
    }
}
/*
Explanation:
1. Create a variable i and write base cases, (i.e when the given number is 0 or 1).
2. Run a loop until i*i <= n, where n is the given number. Increment i by 1.
3. The square root of the number is i – 1
*/