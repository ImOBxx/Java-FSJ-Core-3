import java.util.Scanner;

class Area19
{
	double length;
	double breadth;
	
	void setDim()
	{
		Scanner in = new Scanner (System.in);
		System.out.println("Enter Length: ");
		length = in.nextDouble();
		System.out.println("Enter Breadth: ");
		breadth = in.nextDouble();
		
		
	}
	
	double getArea()
	{
		return length * breadth;
	}
}


public class setdim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area19 o = new Area19();
		o.setDim();
		double area  = o.getArea();
		
		System.out.println("Area Of The Rectangle: " + area);
		

	}

}
