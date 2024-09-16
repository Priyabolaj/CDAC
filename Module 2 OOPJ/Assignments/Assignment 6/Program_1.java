package in.Cdac.Array;

import java.util.Scanner;

/*1.Declare a single-dimensional array of 5 integers inside the main method.
 *  Traverse the array to print the default values. Then accept records from
 *  the user and print the updated values of the array.*/

public class Program_1 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		System.out.println("Default values of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Scanner sc = new Scanner(System.in);

		System.out.println("\nEnter 5 integer values:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("\nUpdated values of the array:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		sc.close();
	}
}
