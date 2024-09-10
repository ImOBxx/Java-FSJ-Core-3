
public class SwapWOThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 6;
        int b = 8;
        
        System.out.println("Before Swapping:");
        System.out.println("A = " + a);
        System.out.println("B = " + b);
        
        
        a = a + b; 
        b = a - b; 
        a = a - b; 
        
        System.out.println("\nAfter Swapping:");
        System.out.println("B = " + a);
        System.out.println("B = " + b);

	}

}
