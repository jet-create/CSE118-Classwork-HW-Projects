import java.util.Scanner;

public class number5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first string: ");
		String s1 = s.nextLine();
		System.out.println("Enter second string: ");
		String s2 = s.nextLine();
		System.out.println("Length of first string is: "+s1.length());
		System.out.println("Length of second string is: "+s2.length());
		if (s2.equals(s1)){
			System.out.println("The strings are equal.");
		}
		else {
			System.out.println("The strings are not equal.");
		}
		
		int cmp = s2.compareTo(s1);
		if (cmp == 0) {
			System.out.println("Both strings are equal to eachother.");
		}
		else if (cmp < 0) {
			System.out.println("First string is greater than the second.");
		}
		else {
			System.out.println("Second string is greater than the first.");
		}
		s.close();
	}

}
