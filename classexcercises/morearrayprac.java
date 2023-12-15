package classexcercises;

public class morearrayprac {

	public static void main(String[] args) {

		int[] card = new int[52];
		for(int i = 0; i<card.length; i++) {
			card[i] = i+1;
		}
		printArray(card, 13);
		randomShuffling(card);
		System.out.println();
		printArray(card, 13);
		
	}
	
	public static void printArray(int[] arr, int numPerLine) {
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
			if((i+1)%numPerLine==0) {
			System.out.println();
			}
		}
	} 
	
	public static int findLargestElement(int[] arr) {
		int largest = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	public static int findSmallestElement(int[] arr) {
		int smallest = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(smallest>arr[i]) {
				smallest = arr[i];
			}
		}
		return smallest;
	}
	
	// find smallest index of the largest number
	public static int smallestIdxToLargestNumber(int[] arr) {
		int idx = 0;
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>arr[idx]) {
				idx = i;
			}
		}
		return idx;
	}
	
	// find largest index of the largest number
	public static int largestIdxToLargestNumber(int[] arr) {
		int idx = 0;
		for(int i =1; i<arr.length; i++) {
			if(arr[i]>=arr[idx])
				idx = i;
		}	
		return idx;
	}
	
	public static void shiftElementsRight(int[] arr) {
		// t = last value in array
		int t = arr[arr.length-1];
		// iterate through array backwards
		for(int i = arr.length-1; i>0; i--) {
			// change value to the value before it
			arr[i] = arr[i-1];
		}
		// set t = first value in array
		arr[0] = t;
	}
	
	public static void shiftElementsLeft(int[] arr) {
		// t = first value in array
		int t = arr[0];
		// iterate through array from start while i is = t second to last value 
		for(int i = 0; i>arr.length-2; i++) {
			// change value to the one that came after
			arr[i] = arr[i+1];
		}
		// set t = last value in array
		arr[arr.length-1] = t;
	}
	
	// random shuffling
	public static void randomShuffling(int[] arr) {
		// iterate through array
		for(int i = 0; i<arr.length; i++) {
			// randomly generate an idx value in range of the array length
			int idx = (int)(Math.random()*arr.length);
			// set t(temporary variable) = value at index i
			int t = arr[i];
			// take value at index i and set equal to randomly generated index value
			arr[i] = arr[idx];
			// set t = iindex value
			arr[idx] = t;
		}
	}
	
	public static int[] smallestAndBiggestElement(int[] arr) {
		int largest = arr[0];
		int smallest = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i] > largest) 
				largest = arr[i];
			if(arr[i] < smallest)
				largest = arr[i];
		}
		// anonymous array
		return new int[]{largest, smallest};
		
		
		/* int[] maxmin = {largest, smallest};
		return maxmin; */
		/* int[] maxmin = new int[2];
		maxmin[0] = largest;
		maxmin[1] = smallest;
		return maxmin; */
	}

}
