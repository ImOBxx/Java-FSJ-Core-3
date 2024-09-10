public class SubArray {

    public static void main(String[] args) {
        // Initialize the given array
        int[] array = {10, 12, 20, 30, 25, 40, 32, 31, 35, 50, 60};
        int n = array.length;

        // Initialize variables to store the indexes of the subarray
        int left = 0;
        int right = n - 1;

        // Find the first element from the left that is out of order
        while (left < n - 1 && array[left] <= array[left + 1]) {
        	//System.out.println("Left: " + left);
        	System.out.println("Array Left: " + array[left]);
            left++;
            
        }

        // If the entire array is already sorted
        if (left == n - 1) {
            System.out.println("The array is already sorted.");
            return;
        }

        // Find the first element from the right that is out of order
        while (right > 0 && array[right] >= array[right - 1]) {
        	//System.out.println("Right: " + right);
        	System.out.println("Array Right: " + array[right]);
            right--;
        }

        // Find the minimum and maximum values in the identified subarray
        int subarrayMin = array[left];
        int subarrayMax = array[left];
        for (int i = left; i <= right; i++) {
            if (array[i] < subarrayMin) {
                subarrayMin = array[i];
                System.out.println("SubArrayMIN: " + subarrayMin);
            }
            if (array[i] > subarrayMax) {
                subarrayMax = array[i];
                System.out.println("SubArrayMAX: " + subarrayMax);
            }
        }

        // Extend the subarray to include any numbers that are out of the sorted range
        while (left > 0 && array[left - 1] > subarrayMin) {
        	System.out.println("Al-1: " +  array[left - 1]);
            left--;
           
        }
        while (right < n - 1 && array[right + 1] < subarrayMax) {
        	System.out.println("AR+1: " +  array[right + 1]);
            right++;
            
        }

        // Print the result
        System.out.println("The unsorted subarray lies between indexes " + left + " and " + right + ".");
    }
}
