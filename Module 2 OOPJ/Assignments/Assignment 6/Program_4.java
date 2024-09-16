package in.Cdac.Array;
/*4.Write a program to remove duplicate elements from a single-dimensional
 *  array of integers.*/
import java.util.Scanner;
import java.util.Arrays;

public class Program_4 {
	static int removeDuplicates(int arr[], int n) {
		if (n == 0 || n == 1)
			return n;
		Arrays.sort(arr);

		int j = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				arr[j++] = arr[i];
			}
		}
		arr[j++] = arr[n - 1];

		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of array");
		int n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter Array element: ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		n = removeDuplicates(arr, n);

		System.out.println("Array after removing duplicates: ");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		sc.close();
	}
}
