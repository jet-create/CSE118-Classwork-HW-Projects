import java.util.Arrays;
import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		String[] strArr = new String[6];
		
		problem1(strArr, sc);
		
		// linearSearch
		System.out.println("cs is found at idx "+problem1c(strArr, "cs"));
		
		// selectionSort
		problem1d(strArr);
		System.out.println(Arrays.toString(strArr));
		
		// binarySearch
		System.out.println("math is found at idx "+problem1e(strArr, "math"));
		
		int[] a = {9, 1, 3, 7};
		int[] b = {9, 1, 3, 7};
		System.out.println("These arrays are similar: "+problem2(a, b));
		
		int[] c = {9, 1, 3, 7};
		int[] d = {2, 3, 4};
		System.out.println("Common element is: "+problem3(c, d));
		
		problem4(sc);
	}
	
	public static void problem1(String[] strArr, Scanner sc) {
		// user inputs a word
		System.out.print("ENTER 6 WORDS:\n");
		// iterate through the array and save the input into an index in the array
		for(int i = 0; i < strArr.length; i++) {
			strArr[i] = sc.nextLine();
		}	
	}
	
	public static int problem1c(String[] strArr, String key) {
		// iterate through the array 
		for(int i = 0; i < strArr.length; i++) {
			// if value at index i is equal to the key then return index
			if(strArr[i].equals(key))
				return i;
		}
		// else return -1 (not found)
		return -1;
	}
	
	public static void problem1d(String[] strArr) {
		// iterate through the array, while i is < array length - 1(index of last num)
		for(int i = 0; i < strArr.length-1; i++) {
			// initialize idx and set it to value of i
			int idx = i; 
			// iterate again and set j to i+1 because i starts at 0
			for(int j = i+1; j < strArr.length; j++) {
				// if value at idx j is compared to value at idx and it is < 0, index is equal to j
				if(strArr[j].compareTo(strArr[idx])<0) {
					idx = j;
				}
			}
			// swap elements 
			String tmp = strArr[idx];
			strArr[idx] = strArr[i];
			strArr[i] = tmp;
		}
	}
	
	public static int problem1e(String[] strArr, String key) {
		// initialize left and right, left is index 0 and right is index of last number
		int left = 0, right = strArr.length-1;
		// loop runs while left <= right, because left is smaller than right, ends when left>right
		while(left<=right) {
			// initialize mid to average value of (left+right)/2
			int mid = (left+right)/2;
			// if value at index mid == the key
			if(strArr[mid].equals(key)) {
				// simply return mid if true
				return mid;
			}
			/* compareTo gives int > 0 if first string is greater than other string
			 * gives an int = 0 if the strings are equal, or just use .equals function
			 * gives int < 0 if first string is smaller than the string being compared to
			 */
			
			// key is less than strArr[mid]
			else if(strArr[mid].compareTo(key)>0) {
				// check the first half of the array (left side)
				right = mid -1;
			}
			// key is greater than strArr[mid]
			else {
				// check the second half of the array (right side)
				left = mid +1;
			}
		}
		// return -1 if not found 
		return -1;
	
		// built-in binarySearch method in java array library
		// return java.util.Arrays.binarySearch(strArr, key);
	}
	
	public static boolean problem2(int[] a, int[] b) {
		// set up a boolean to flag true if arrays are identical and flag false if not identical
		boolean isIdentical = true;
		// if the sizes of the array are equal, now check values
		if(a.length == b.length) {
			// iterate through array
			for(int i = 0; i < a.length; i++) {
				// if value of a[i] and b[i] are not equal
				if(a[i] != b[i]) {
					// flag boolean false
					isIdentical = false;
				}
			}
		}
		// else if sizes are not equal, flag boolean false
		else {
			isIdentical = false;
		}
		// return the boolean result
		return isIdentical;
	} 
	
	public static int problem3(int[] a, int[] b) {
		// use for-each loop to list out the values in array a
		for(int num1 : a) {
			// for-each loop to list out values in array b 
			for(int num2 : b) {
				// if values match, we have found a common element
				if(num1 == num2) {
					// return this element, can also return num2
					return num1;
				}
			}
		}
		// if there are no similar elements, return -1
		return -1;
	}
	
	public static int[] problem4(Scanner sc) {
		// prompt user to enter a string and save value in str
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		
		// create array 'occurence' of size 10 because there are 10 digital chars in ASCII table
		int[] occurence = new int[10];
		// iterate throught the string
		for(int i = 0; i < str.length(); i++) {
			// if the character it lands on is a digital char
			if(Character.isDigit(i)) {
				// save in variable 'digit'
				char digit = str.charAt(i);
				// increment that digit in the array, subtract '0' from digit to get ch value
				occurence[digit-'0']++;
			}
		}
		// return the array
		return occurence;
		
	}
}
