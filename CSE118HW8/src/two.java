import java.util.Scanner;

public class two {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String ns = sc.nextLine();
		
		System.out.printf("There are %d spaces.", spaceCounter(ns));
		System.out.printf("\nThere are %d digital characters.", digitalCharCounter(ns));
		System.out.printf("\nThere are %d uppercase letters.", upcaseCounter(ns));
		System.out.printf("\nThere are %d lowercase letters.", lowcaseCounter(ns));
		
	}

	public static int spaceCounter(String str) {
		
		int spaceCount = 0;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)==' ') {
				spaceCount++;
			}	
		}
		return spaceCount;
	}
	
	public static int digitalCharCounter(String str) {
		
		int numCount = 0;
		for(int i = 0; i<str.length();i++) {
			if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
				numCount++;
			}
		}
		return numCount;
	}
	
	public static int upcaseCounter(String str) {
		
		int upcaseCount = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)>='A'&&str.charAt(i)<='Z') {
				upcaseCount++;
			}
		}
		return upcaseCount;
	}
	
	public static int lowcaseCounter(String str) {

		int lowcaseCount = 0;
		for(int i = 0; i<str.length(); i++) {
			if(str.charAt(i)>='a'&&str.charAt(i)<='z') {
				lowcaseCount++;
			}
		}
		return lowcaseCount;
		
		
	}
}







