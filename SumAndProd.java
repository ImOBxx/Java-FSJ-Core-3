import java.util.Scanner;

public class SumAndProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Array Length: ");
		n = in.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
		{
			System.out.println("Enter Array Numbers; ");
			arr[i] = in.nextInt();
		}
		int sum = 0;
		int prod = 1;
		for (int i = 0; i < n; i++)
		{
			sum = sum + arr[i];
		}
		for (int i = 0; i < n; i++)
		{
			prod = prod * arr[i];
		}
		System.out.println("Sum Of Array: " + sum);
		System.out.println("Product Of Array: " + prod);
		
		
		

	}

}
