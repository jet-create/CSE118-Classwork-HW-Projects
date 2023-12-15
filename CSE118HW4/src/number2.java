import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//prompt user to enter 2 integers
		System.out.println("Integer 1 & 2: ");
		int num0 = s.nextInt();
		int num1 = s.nextInt();
		
		//boolean expression to check is num0 is divisible by num1
		Boolean bDiv = (num0%num1==0);
		
		//if bDiv is true print if statement, if false print else
		if (bDiv) {
			System.out.println("Integer 1 is divisble by Integer 2.");
		}
		else {
			System.out.println("Integer 1 is not divisble by Integer 2.");
		}
		
		//boolean to check if num1 is divisible by num0
		Boolean bDiv2 = (num1%num0==0);
		
		//if bDiv2 is true print if statement, if false print else

		if (bDiv2) {
			System.out.println("Integer 2 is divisble by Integer 1.");
		}
		else {
			System.out.println("Integer 2 is not divisble by Integer 1.");
			
		s.close();
		}
	}

}
