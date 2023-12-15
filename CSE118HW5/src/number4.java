import java.util.Random;

public class number4 {

	public static void main(String[] args) {
		
		Random r = new Random(); 
		
		//a, generate a random 4 digit number 
		int fourDigit = r.nextInt(1000, 10000);
		System.out.println("Your number is "+fourDigit);
		//b, Extract digits from number
		int thou = (fourDigit / 1000);
		System.out.println("Thousands place = "+thou);
		
		int hund = (fourDigit % 1000) / 100;
		System.out.println("Hundreds place = "+hund);
		
		int tens = (fourDigit % 100) / 10;
		System.out.println("Tens place = "+tens);
		
		int ones = (fourDigit % 10);
		System.out.println("Ones place = "+ones);
		//c, check if numbers are ascending or descending or none
		boolean descending = (thou>hund)&&(hund>tens)&&(tens>ones);
		boolean ascending = (thou<hund)&&(hund<tens)&&(tens<ones);
		
		if (descending) {
			System.out.println("The numbers are descending.");
		}
		else if (ascending) {
			System.out.println("he numbers are ascending.");
		}
		else {
			System.out.println("The numbers are not in order.");
			
		}
		//d, check if numbers are palindrome numbers 
		boolean palindrome = (thou==ones)&&(hund==tens);
		
		if (palindrome) {
			System.out.println("The number is a palindrome.");
		}
		else {
			System.out.println("The number is not a palindrome.");
		}
		
		
	}

}
