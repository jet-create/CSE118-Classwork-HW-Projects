package classexcercises;

public class problems {

	public static void main(String[] args) {
		
		int[] a = new int[16];
		for(int i=0;i<a.length;i++) {
			a[i] = (int)(Math.random()*16);
		}
		
		selectionSort(a);
		
		return;
		
	}
	
	public static void selectionSort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			// task1:find the smallest element from location i to a.length-1
			int idx = i;
			// start j at i+1 bc i starts from 0
			for(int j = i+1; j<a.length; j++) {
				if(a[j] < a[idx])
					idx = j;
				
			}
			// task2:move the smallest element to location a[i](i.e. first element gets moved to a[0] and so on
			if(idx != i) {
				int tmp = a[i];
				a[i] = a[idx];
				a[idx] = tmp;
			}
		}
	}
	
	public static int binarySearch(int[] a, int num) {
	
		int left = 0;
		int right = a.length-1;
		while(left<=right) {
			int mid = (left+right)/2;
			if(a[mid] == num) {
				return mid;
			}
			else if(a[mid] > num) {
				right = mid -1;
			}
			else { // case : a[mid] < num
				left = mid +1;
			}
		}
		return -1;
	}
	
	public static int linearSearch(int[] a, int num) {
		for(int i=0; i<a.length; i++) {
			if(a[i]==num)
				return i;
		}		
		return -1;
	}
	
	public static int[] occurenceInStrings(String str) {
		// input the string and find the occurences of that letter in the array
		
		// 26 letters in alphabet
		int[] occurence = new int[26];
		// iterate through string
		for(int i=0; i < str.length(); i++) {
			// if the Character.isLetter evaluates to true store value in variable ch
			if(Character.isLetter(str.charAt(i))){
				char ch = Character.toUpperCase(str.charAt(i));
				// ch - 'A' gives you the letter and increments it
				occurence[ch-'A']++;
			}
		}
		// return array
		return occurence;
	}
}
