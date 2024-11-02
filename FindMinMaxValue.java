// problem Statement: Write a Java program to find the maximum and minimum value of an array.

/*
 Original Array: [25, 14, 56, 15, 36, 56, 77, 18, 29, 49]                                                     
 Maximum value for the above array = 77                                                                       
 Minimum value for the above array = 14  
 */

import java.util.Scanner;

public class ArrayMinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Initialize the array
        int[] arr = new int[n];
        
        // Input array elements
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Initialize min and max values
        int min = arr[0];
        int max = arr[0];
        
        // Loop through the array to find min and max values
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        // Output the results
        System.out.println("Minimum value in the array: " + min);
        System.out.println("Maximum value in the array: " + max);
        
        scanner.close();
    }
}
