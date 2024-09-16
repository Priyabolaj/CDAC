package in.Cdac.Array;

import java.util.Arrays;
import java.util.Scanner;

/*Write a program to find the maximum and minimum values in a 
 * single-dimensional array of integers*/
public class Program_3 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integer values:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("By writing logic Maximum value: " + max);
		System.out.println("By writing logic Minimum value: " + min);

		max = Arrays.stream(arr).max().getAsInt();
		min = Arrays.stream(arr).min().getAsInt();

		System.out.println("By Inbuild Function Maximum value: " + max);
		System.out.println("By Inbuild Function Minimum value: " + min);

		sc.close();
	}
}
