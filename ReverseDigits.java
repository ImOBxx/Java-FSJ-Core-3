import java.util.Scanner;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r;
		int sum = 0;
		int n;
		int x;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Number: ");
		n = in.nextInt();
		while (n > 0)
		{
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		while (sum > 0)
		{
			x = sum % 10;
			System.out.println(x);
			sum = sum / 10;
			
		}

	}

}
