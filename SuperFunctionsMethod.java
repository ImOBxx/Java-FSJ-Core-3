



		class Animal {
		    public void sound() {
		        System.out.println("Animal makes a sound");
		    }
		}

		class Dog extends Animal {
			@Override
		    public void sound() {
		        super.sound(); // Calls the sound method of Animal class
		        System.out.println("Dog barks");
		    }
		}

		public class SuperFunctionsMethod {
		    public static void main(String[] args) {
		        Dog dog = new Dog();
		        dog.sound(); // Output: Animal makes a sound
		                     //         Dog barks
		    }
		


	}


