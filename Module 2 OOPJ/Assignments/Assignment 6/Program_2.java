package in.Cdac.Array;

import java.util.Scanner;

/*2.Declare a single-dimensional array of 5 integers inside the main method.
 * Define a method named acceptRecord to get input from the terminal into 
 * the array and another method named printRecord to print the state of the 
 * array to the terminal.*/
public class Program_2 {
	public static void acceptRecord(int[] arr) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 integer values:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
	}

	public static void printRecord(int[] arr) {
		System.out.println("\nArray values:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {
		int[] arr = new int[5];
		acceptRecord(arr);
		printRecord(arr);
	}
}
