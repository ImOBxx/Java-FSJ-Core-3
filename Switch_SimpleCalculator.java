import java.util.Scanner;

public class Switch_SimpleCalculator {

    public static void main(String[] args) {
        // Variable declarations
        char opt;
        int a;
        int b;
        int result = 0;
        boolean validOperation = true;
        
        // Scanner object for user input
        Scanner in = new Scanner(System.in);

        // User input for operation choice
        System.out.println("Enter Choice (+, -, /, *): ");
        opt = in.next().charAt(0);

        // User input for numbers
        System.out.println("Enter Number A: ");
        a = in.nextInt();
        System.out.println("Enter Number B: ");
        b = in.nextInt();

        // Switch case to perform chosen operation
        switch (opt) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                // Check for division by zero
                if (b != 0) {
                    result = a / b;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Invalid Input.");
                validOperation = false;
        }

        // Print result if operation was valid
        if (validOperation) {
            System.out.println("Result: " + result);
        }
    }
}
