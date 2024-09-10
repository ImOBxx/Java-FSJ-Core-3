
public class ReverseNumberJNIIT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 132;
		int sum = 0;
		int r;
		
		while (n > 0)
		{
			r = n % 10;
			sum = (sum * 10) + r;
			n = n / 10;
		}
		
		System.out.println("Reversed Digits: " + sum);
		

	}

}
