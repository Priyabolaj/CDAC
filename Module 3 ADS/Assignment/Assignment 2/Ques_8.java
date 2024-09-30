import java.util.Scanner;

public class Ques_8 {

    public static int ArrayManu(int n, int[][] q) {
        int[] arr = new int[n + 1];  

        for (int i = 0; i < q.length; i++) {
            int start = q[i][0] - 1;  
            int end = q[i][1];        
            int value = q[i][2];

            arr[start] += value;  
            if (end < n) {
                arr[end] -= value; 
            }
        }
        int max = 0;   
        int currentSum = 0;  

        for (int i = 0; i < n; i++) {
            currentSum += arr[i];  
            if (currentSum > max) {
                max = currentSum;  
            }
        }

        return max; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  size : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of q: ");
        int que = sc.nextInt();
        int[][] q = new int[que][3];

        System.out.println("Enter the q in the format (start end value)");
        for (int i = 0; i < que; i++) {
            q[i][0] = sc.nextInt();  
            q[i][1] = sc.nextInt();  
            q[i][2] = sc.nextInt();  
        }
        int result = ArrayManu(n, q);
        System.out.println("Maximum value after all operations: " + result);
    }
}
