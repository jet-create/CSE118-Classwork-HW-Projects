package classexcercises;

import java.util.Scanner;

public class arraysprac {

	public static void main(String[] args) {

		// initializing with input values
		int[] a = new int[60];
		System.out.printf("The size of the array is %d\n", a.length);
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<a.length; i++) {
			a[i] = (int)(Math.random()*21-10);
		}
		
		printArray(a, 10);
		sumArray(a);
		
		largestValueInArray(a);
		
	}

	
	
	public static void printArray(int[] arr, int numPerLine) {
		for(int i = 0; i<arr.length; i++) {
			System.out.printf("%d\t", arr[i]);
			if((i+1)%10==0) {
				System.out.println();
			}
		}
		
	}
	
	// summing array
	public static int sumArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum;
	}
	
	// finding average of array
	public static double averageArray(double[] arr) {
		//solution 1 ( more efficient )
		int sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return(double)sum/arr.length;
		// solution 2
		/* double sum = 0;
		for(int i = 0; i<arr.length; i++) {
			sum+=arr[i];
		}
		return sum/arr.length;
		*/
	}
	
	// find largest element
	public static int largestValueInArray(int[]arr) {
		int largest = arr[0];
		for(int i = 1; i<arr.length; i++) {
			if(arr[i]>largest) {
				largest = arr[i];
			}
		}
		return largest;
	}
	
	
	
}
