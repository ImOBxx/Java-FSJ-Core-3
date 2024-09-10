
public class SwapVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 8;
		
		System.out.println("Before Swapping A : " + x);
		System.out.println("Before Swapping B : " + y);
		
		int temp = x;
		x = y;
		y = temp;
		
		System.out.println("After Swapping A : " + x);
		System.out.println("After Swapping B : " + y);

	}

}
