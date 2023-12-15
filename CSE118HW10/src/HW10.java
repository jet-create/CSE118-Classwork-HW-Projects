import java.util.Arrays;

public class HW10 {

	public static void main(String[] args) {
		
		int[] a = createArray(48);
		problem1AToC(a, 8);
		problem1DToE(a);
		problem1F(a);
		System.out.println();
		
		problem2(10);
		System.out.println();
		// used a-b to initialize values in my array of size 30
		// with 5 nums per line using createArray as an input for the parameter int[]
		int[] b = problem3AToB(createArray(30), 5); 
		System.out.println();
		//used c to shuffle by using input int[] b which was made by using a-b
 		problem3C(b);
		System.out.println();
		
		problem5(10);
	}

	public static int[] createArray(int size) {
		// initialize array a of size input
		int[] a = new int [size];
		for(int i = 0; i < a.length; i++) {
			// iterates through array and initializes random value for a[i]
			a[i] = (int)(Math.random()*203-101+1)-101;
		}
		return a;
	}
	
	public static void printArray(int[] a, int numsPerLine) {
		// iterates through array 
		for(int i = 0; i < a.length; i++) {
			// prints values at a[i]
			System.out.printf("%d\t", a[i]);
			// determines nums per line,"i+1" because of 0
			if((i+1)%numsPerLine==0) {
				System.out.println();
			}
		}
	}
	
	public static void problem1AToC(int[] a, int numPerLine) {
		// initialize our counters
		int gt = a[0], lt = a[0];
		int gtCount = 0, ltCount = 0;
		// loop iterates through array
		for(int i = 0; i < a.length; i++) {
			// prints the array
			System.out.printf("%4d", a[i]);
			// prints out x nums per line
			if((i+1)%numPerLine==0)
				System.out.println();
			// if a[i] is greater than assumed value then a[i] = greatest value
			if(a[i]>gt) {
				gt = a[i];
				// if a[i] == to the assumed value, count this number
			} else if(a[i] == gt){
				gtCount++;
			}
			// if a[i] is less than assumed value then a[i] = lowest value
			if(a[i]<lt) {
				lt = a[i];
				// if a[i] == to the assumed value, count this number
			} else if(a[i] == lt) {
				ltCount++;
			}
		}
		System.out.printf("\nThe largest element is %d. There are %d %d's in the array.", gt, gtCount, gt);
		System.out.printf("\nThe smallest element is %d. There are %d %d's in the array.", lt, ltCount, lt);
	}
	
	public static void problem1DToE(int[] a) {
		// initialize our sum value
		int sum = 0;
		// iterate through array
		for(int i = 0; i < a.length; i++) {
			// get the total of the array
			sum+=a[i];
		}
		// get average of the array
		double average = (double)sum/a.length;
		// initialize counter that counts how many numbers are greater than average
		int avgCount = 0;
		// iterate through array
		for(int i = 0; i < a.length; i++) {
			// a[i] greater than average, increment the count
			if(a[i]>average)
				avgCount++;
		}
		System.out.printf("\nThe average of the array is %.3f.", average);
		System.out.printf("\n%d elements in the array are greater than the average of the array.\n", avgCount);
		
	}
	
	public static void problem1F(int[] a) {
		// t = last element in array
		int t = a[a.length-1];
		// loop starts from the end of the array
		for(int i = a.length-1; i > 0; i--) {
			// a[i] = a[i-1] to make it equal the value before shifting it rightward
			a[i] = a[i-1];
		}
		// set t to the first value in the array
		t = a[0];
		System.out.println();
		printArray(a, 8);
	}
	
	public static void problem2(int numPerLine) {
		int idx = 0;
		int twenty = 0;
		int even = 0, odd = 0;
		// arrayLen = value between 50 and 100, upperbound exclusive
		int arrayLen = (int)(50 + Math.random()*51);
		// define int size of arrayLen
		int[] a = createArray(arrayLen);
		//display the array
		printArray(a, numPerLine);
		// boolean used to track if 0 is in array, starts at false because zero hasn't been found
		boolean zeroFound = false;
		// loop to go through array
		for(int i = 0; i < a.length; i++) {
			// initialize wth random nums in range (-100, 100)
			a[i] = (int)(Math.random()*202-100+1)-100;
			// creates lines for the array
			if((i+1)%numPerLine==0) {
				System.out.println();
			}
			// counts occurences of 20
			if(a[i]==20) {
				twenty++;
			}
			// if a[i] finds a zero it will print its index and set the boolean to true, meaning we've found zero
			if(a[i] == 0) {
				System.out.printf("\n0 is found at index %d.", i);
				zeroFound = true;
			}
		}
		// checks if zeroFound is still false and if it is, print the statement
		if(!zeroFound) {
			System.out.print("\n0 is not an element in this array.");
		}
		System.out.printf("\n20 was found %d times in the array.", twenty);
		
	
	}
	
	// make this method return an array bc we want it to be applicable to 3C
	public static int[] problem3AToB(int[] a, int numPerLine) {
		// declares array of size "size"
		int[] array = createArray(30);
		array[0] = 0;
		array[1] = 1;
		// loop to generate the values of the array
		for(int i = 2; i < 30; i++) {
			array[i] = array[i-1] + array[i-2];
		}
		// use printArray method to get the array printed
		printArray(array, 5);
		return array;
	}
	
	// return an int[]
	public static int[] problem3C(int[] a) {
		for(int i = 0; i < a.length; i++) {
			// randomly generate value for index
			int idx = (int)(Math.random()*a.length);
			// begin shuffle
			// set t = value at index i
			int t = a[i];
			// set value at index i = index
			a[i] = a[idx];
			// set index = temp value
			a[idx] = t;
		}
		// use method to print out my array
		printArray(a, 5);
		return a;
	}

	public static boolean ascending(int[] a) {
		for(int i = 0; i < a.length - 1; i++){
			if(a[i] >= a[i+1])
				return false;
		}
		return true;
	}
	
	public static boolean descending(int[] a) {
		for(int i = 0; i < a.length - 1; i++) {
			if(a[i] <=  a[i + 1])
				return false;
		}
		return true;
	}
	public static void problem4(int[] a) {
		if(ascending(a)) {
			System.out.println("The array is in ascending order.");
		}else if(descending(a)) {
			System.out.println("The array is in descending order.");
		}
		else {
			System.out.println("The array is not sorted.");
		}
		
	}
	
	public static void problem5(int numsPerLine) {
		// using built in method to create array of size 20
		int[] array1 = createArray(20);
		// iterate through array1 and generate random values from -100 to 100
		for(int i = 0; i < array1.length; i++) {
			array1[i] = (int)(Math.random()*202-100+1)-100;
		}
		// print array with specified numbers per line
		printArray(array1, numsPerLine);
		
		System.out.println();
		
		// copy array1 to array2
		int[] array2 = new int[array1.length];
		// iterate through array2 and copy values of array1 to array2
		for(int i = 0; i < array2.length; i++) {
			array2[i] = array1[i];
		}
		
		// print array2
		printArray(array2, numsPerLine);
		System.out.println();
		
		// use selective sorting to print positive numbers first
		selectionSort(array2);
		printArray(array2, numsPerLine);
	}
	
	public static void selectionSort(int[] a) {
		// iterate through the array from index 0 to index a.length-1
		for(int i = 0; i < a.length-1; i++) {
			// find the biggest element from location i to a.length-1
			int idx = i;
			// start j at i+1 because i starts at 0
			for(int j = i + 1; j < a.length; j++) {
				// if value at index j is > value at index 'idx'
				if(a[j] > a[idx])
					idx = j;
			}
			// move the biggest element to location a[i](i.e. first element gets moved to a[0] and so on
			int tmp = a[i];
			a[i] = a[idx];
			a[idx] = tmp;
			}
		}
	}

