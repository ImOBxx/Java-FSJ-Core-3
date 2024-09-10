import java.util.Scanner;

public class SumOfDigitsInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
        System.out.println("Enter Number: ");
        n = in.nextInt();
		int sum = 0;
		int r;
		while (n > 0)
		{
			r = n % 10;
			sum = sum + r;
			n = n / 10;
		}
		System.out.println("Sum Of Digits: " + sum);
		
		

	}

}
