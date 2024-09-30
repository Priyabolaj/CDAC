import java.util.*;
class Ques_6{
	static void reverse(String[] arr)
	{
		for(int i=0;i<arr.length/2;i++) 
		{
			String temp = arr[i];
			arr[i]= arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter String: ");
		String sent = sc.nextLine();
		String[] arr = sent.split(" ");
		
		reverse(arr);
		String reverse = String.join(" ",arr);
		System.out.print("\nReversed Array: "+reverse);
		
	}
}