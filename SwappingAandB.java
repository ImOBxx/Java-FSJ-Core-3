import java.util.Scanner;

public class SwappingAandB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Swapping Values:- ");
		System.out.println("\n");
		int a, b, temp;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter A: ");
		a = in.nextInt();
		System.out.print("Enter B: ");
		b = in.nextInt();
		System.out.println("\n");
		System.out.println("Before Swapping: A: " + a);
		System.out.println("Before Swapping: B: " + b);
		temp = a;
		a = b;
		b = temp;
		System.out.println("\n");
		System.out.println("After Swapping: A: " + a);
		System.out.println("After Swapping: B: " + b);
	
		

	}

}
