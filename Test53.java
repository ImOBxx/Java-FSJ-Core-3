

class Vehicle {
	int maxSpeed = 120;
}

class Car extends Vehicle 
{
	int maxSpeed = 180;
	
	void display()
	{
		System.out.println("Max Speed: " + super.maxSpeed);
	}
}

public class Test53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car small = new Car();
		small.display();

	}

}
