import java.util.*;
class Ques_10 {
	public static void arrayRotate(int[] arr,int d) 
	{
       int n = arr.length;
	   d = d % n; 
       for(int i=0 ; i<d ; i++) 
	   {
           int temp = arr[0];
           
           for(int j=0 ; j<n-1 ; j++) 
		   {
               arr[j] = arr[j+1];
           }
           arr[n-1] = temp;
       }
       
    }
    public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size: ");
		int size = sc.nextInt();
        int[] arr = new int[size];
		System.out.print("Enter array: ");
		for(int i=0 ; i<size ;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Enter d: ");
        int d = sc.nextInt() ;
        arrayRotate(arr,d);
		System.out.print("Rotated array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }    
}