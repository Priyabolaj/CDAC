package in.Cdac.Array;

import java.util.Scanner;

public class Program_6 {
	public static int totalSum(int range) {
		return range * (range + 1) / 2;
	}
	public static int missingNumber(int arr[],int range ) {
		int arraySum = 0;
		for (int i = 0; i < arr.length; i++) {
			arraySum += arr[i];
		}
		return totalSum(range) - arraySum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Range: ");
		int range = sc.nextInt();
		int[] arr = new int[range-1]; 
		System.out.println("Enter Array "+(range-1)+" Element: ");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}

		int number = missingNumber(arr,range);
		System.out.println("The missing number is: " + number);
		sc.close();
	}

}
