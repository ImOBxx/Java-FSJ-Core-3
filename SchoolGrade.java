import java.util.Scanner;

public class SchoolGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int p;
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Percentage: ");
		p = in.nextInt();
		
		if (p >= 80)
		{
			System.out.println("A Grade.");
		}
		else if (p < 80 && p >= 60)
		{
			System.out.println("B Grade.");
		}
		else if (p < 60 && p >= 50)
		{
			System.out.println("C Grade.");
		}
		else if (p < 50 && p >= 45)
		{
			System.out.println("D Grade.");
		}
		else if (p < 45 && p >= 25)
		{
			System.out.println("E Grade.");
		}
		else if (p < 25)
		{
			System.out.println("F Grade.");
		}
		
		
		
		
		

	}

}
