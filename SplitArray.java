import java.util.Scanner;

public class SplitArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        
        // Specify the array length as 10
        int n = 10;
        int arr[] = new int[n];
        
        // Read array values from the user
        System.out.println("Enter " + n + " array values:");
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        
        // Create two arrays to store the split halves
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        
        // Split the initial array into two halves
        for (int i = 0; i < 5; i++) {
            arr1[i] = arr[i];
            arr2[i] = arr[i + 5];
        }
        
        // Print the first half
        System.out.println("First half of the array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        // Print the second half
        System.out.println("Second half of the array:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        
        // Close the scanner
        in.close();
    }
}
