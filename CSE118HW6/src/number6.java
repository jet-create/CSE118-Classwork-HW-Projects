import java.util.Scanner;

public class number6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("Enter a 5 character string: ");
		String user = s.nextLine();
		
		boolean b0 = (user.charAt(0)==(user.charAt(4)));
		boolean b1 = (user.charAt(1)==(user.charAt(3)));
		if (b0&&b1) {
			System.out.println("This string is a palindrome.");
		}
		else {
			System.out.println("This string isn't a palindrome.");
		}
		
		String ns = "";
		char ch;
		for (int i = 0; i < user.length(); i++) {
			 ch = user.charAt(i);
			 ns = ch + ns;
		}	
		
		/*boolean palindrome = true;
		for (int j = 0; j < user.length()/2; j++)
			if (user.charAt(j) != user.charAt(user.length()-j)) {
				palindrome = false; 
				break;
			}
			return;
			*/
			
		//s.close();
	}

}
