import java.util.*;
public class Ques_2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.print("\nEnter array element: ");
		for (int i = 0; i < n; i++)
		{
			arr[i] = sc.nextInt();
		}
        int newLength = removeDuplicates(arr);
        System.out.println("New length: " + newLength);
    }

    public static int removeDuplicates(int[] arr) {
        if (arr.length == 0) return 0;
        
        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) {
                arr[index] = arr[i];
                index++;
            }
        }
        return index;
    }
}
