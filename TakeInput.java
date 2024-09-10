import java.util.Scanner;

public class TakeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner (System.in);
		int n;
		int count = 0;
		int sum = 0;
		int avg = 0;
		int prod = 1;
		char s = 0;
		while (true)
		{
			System.out.print("Enter Number: ");
			n = in.nextInt();
			sum = sum + n;
			prod = prod * n;
			count++;
			System.out.print("Do You Want To Continue (Y: Keep Entering / Q: For Exit) : ");
			s = in.next().charAt(0);
			if (s == 'q' || s == 'Q')
			{
				break;
			}
		
			
		}
	
		System.out.println("Product: " + prod);
		System.out.println("Average: " + sum / count);
	}

}
