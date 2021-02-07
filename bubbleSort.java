
public class bubbleSort {

	public static void main(String[] args) {
		int a[] = new int[] {1, 2, 3};
	       int numOfSwaps = 0;
	        int n = a.length;
	        for (int i = 0; i < n;) {
	            for (int j = 0; j < n - 1; j++) {
	                // Swap adjacent elements if they are in decreasing order
	                if (a[j] > a[j + 1]) {
	                    numOfSwaps++;
	                    int temp = a[j];
	                    a[j] = a[j + 1];
	                    a[j+1] = temp;
	                }
	            }
	            n--;
	        }
	        System.out.println("Array is sorted in " + numOfSwaps + " swaps.");
	        System.out.println("First Element: " + a[0]);
	        System.out.println("Last Element: " + a[a.length-1]);

	}

}
