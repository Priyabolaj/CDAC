package in.Cdac.Array;

import java.util.Scanner;

class Record {
    private int[] numbers;
    public Record(int size) {
        numbers = new int[size]; 
    }
    public void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + numbers.length + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt(); 
        }
        sc.close();
    }
    public void printRecord() {
        System.out.println("The entered numbers are:");
        for (int number : numbers) {
            System.out.println(number); 
        }
    }
}
public class Program_7 {
	public static void main(String[] args) {
		Record record = new Record(5); 
        record.acceptRecord();        
        record.printRecord();   
	}
}
