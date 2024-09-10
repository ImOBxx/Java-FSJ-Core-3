import java.util.Scanner;

public class ShopPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double p;
		double d = 0.10;
		double u;
		
		System.out.println("Enter Units: ");
		u = in.nextDouble();
		System.out.println("Enter Price: ");
		p = in.nextDouble();
		
		double tp = u * p;
		
		if (tp > 1000)
		{
			double x = tp * d;
			double ntp = tp + x;
			System.out.println("New Price: " + ntp);
		}
		else 
		{
			System.out.println("Original Price: " + tp);
		}
		
		

	}

}
