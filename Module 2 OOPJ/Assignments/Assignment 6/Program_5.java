package in.Cdac.Array;
/*5.Write a program to find the intersection of two single-dimensional 
 * arrays.*/
import java.util.Scanner;
import java.util.Arrays;

public class Program_5 {
    public static void intersection(int arr1[], int arr2[], int n1, int n2) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int i = 0, j = 0;
        while (i < n1 && j < n2) 
        {
            if (arr1[i] < arr2[j]) 
            {
                i++;
            } 
            else if (arr1[i] > arr2[j]) 
            {
                j++;
            } 
            else 
            {
                System.out.println(arr1[i] + " ");
                i++;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of array1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter Size of array2: ");
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];

        System.out.println("Enter Array1 elements: ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter Array2 elements: ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }

        System.out.println("Intersection of two arrays:");
        intersection(arr1, arr2, n1, n2);
    }
}
