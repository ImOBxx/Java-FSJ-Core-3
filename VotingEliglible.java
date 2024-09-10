import java.util.Scanner;

public class VotingEliglible {
	
	void vote(int n)
	{
		if (n < 18)
		{
			System.out.println("Person is Not Allowed To Vote.");
		}
		else
		{
			System.out.println("Person is Allowed To Vote.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int n;
		System.out.println("Enter Age: ");
		n = in.nextInt();
		VotingEliglible o = new VotingEliglible();
		o.vote(n);
		
		

	}

}
