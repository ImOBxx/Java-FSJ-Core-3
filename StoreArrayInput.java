import java.util.Scanner;

public class StoreArrayInput {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10]; // Initialize an array of size 10
        
        // Loop to take input from the user and store in the array
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter Number: ");
            arr[i] = in.nextInt();
        }

        // Print the elements of the array
        System.out.println("You entered: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

        in.close(); // Close the scanner to avoid resource leak
    }
}
