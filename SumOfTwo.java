import java.util.Scanner;

public class SumOfTwo {
	
	int sum(int a, int b)
	{
		return a + b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a, b;
        System.out.println("Enter 1st Number: ");
        a = in.nextInt();
        System.out.println("Enter 2nd Number: ");
        b = in.nextInt();
        SumOfTwo o = new SumOfTwo();
        System.out.println("Sum of Two Numbers: " + o.sum(a, b));        
        
        

	}

}
