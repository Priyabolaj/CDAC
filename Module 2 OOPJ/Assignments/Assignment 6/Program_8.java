package in.Cdac.Array;

import java.util.Scanner;

class ModifyArray {
	private int[] numbers;

	public ModifyArray(int size) {
		numbers = new int[size];
	}

	public void setNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter " + numbers.length + " numbers:");
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = sc.nextInt();
		}
		sc.close();
	}

	public int[] getNumbers() {
		return numbers;
	}
}

public class Program_8 {
	public static void main(String[] args) {
		ModifyArray r = new ModifyArray(5);
		r.setNumbers();
		System.out.println("The entered numbers are:");
		int[] nums = r.getNumbers();
		for (int num : nums) {
			System.out.println(num);
		}
	}
}
