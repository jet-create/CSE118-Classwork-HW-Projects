package midtermcse118;

import java.util.Scanner;

public class number6 {

	public static void main(String[] args) {
		
		Scanner j = new Scanner(System.in);
		
		System.out.println("Enter character string: ");
		String user = j.nextLine();
		int len = user.length();
		System.out.println("Length: "+len);
		char mid = (char)(user.length()/2);
		int ascii = (int)(mid);
		System.out.println("The char is "+mid);
		System.out.println("The ASCII code of this char is "+ascii);
		if (mid>='a'&&mid<='z'||mid>='A'&&mid<='Z') {
			System.out.println("Char is letter: "+mid);
		}
		else {
			System.out.println("Char is not a letter.");
		}
		int first = user.indexOf(' ');
		String firstWord = user.substring(0, first);
		System.out.println("First word is: "+firstWord);
		
		int second = user.lastIndexOf(' ');
	    String secondWord = user.substring(second + 1);
	    System.out.println("Second word is: " + secondWord);
		//assume last word is 5 char long
		boolean b0 = (user.charAt(0)==(user.charAt(4)));
		boolean b1 = (user.charAt(1)==(user.charAt(3)));
		if (b0&&b1) {
			System.out.println("This string is a palindrome.");
		}
		else {
			System.out.println("This string isn't a palindrome.");
		}
		
		int compare = firstWord.compareTo(secondWord);
		if (compare == 0) {
			System.out.println(firstWord);
		}
		else if (compare < 0) {
			System.out.println(firstWord + " " + secondWord);
		}
		else {
			System.out.println(secondWord + " " + firstWord);
		}
		

	}

}
