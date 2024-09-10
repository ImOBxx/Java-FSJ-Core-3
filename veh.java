
abstract class Vehicler
{
	abstract void drive();
}

class Carr extends Vehicler
{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Car Drives");
	}
	
}

class Bikee extends Vehicler
{

	@Override
	void drive() {
		// TODO Auto-generated method stub
		System.out.println("Bike Rides");
	}
	
}


public class veh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicler a = new Carr();
		Vehicler b = new Bikee();
		
		a.drive();
		b.drive();

	}

}
