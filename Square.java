import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sq;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Sides: ");
		sq = in.nextInt();
		int area  = sq * sq;
		int peri = 4 * sq;
		
		System.out.println("Area Of The Square: " + area);
		System.out.println("Perimeter Of The Square: " + peri);
		
		
		
		

	}

}
