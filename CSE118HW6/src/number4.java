import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String user = s.nextLine();
		System.out.println("The length of the string is "+user.length());
		System.out.println("The first character is "+user.charAt(0));
		int length = user.length();
		char last = user.charAt(length-1);
		System.out.println("The last character is "+last);
		int mid = length/2;
		char middle = user.charAt(mid);
		System.out.println("The middle character is "+middle);
		if (middle < 48) {
			System.out.println("Middle character is not a digital char");
		}
		else if (middle > 57){
			System.out.println("Middle character is not a digital char");
		}
		else {
			System.out.println("Middle character is a digital char");
		}
		//set last character as char because char is int, or else will return number
		
		
		
	}

}
