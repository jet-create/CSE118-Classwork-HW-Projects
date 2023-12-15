import java.util.Scanner;

public class number1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//prompt user
		System.out.println("Enter a 2-digit number: ");
		int num = s.nextInt();
		
		//check to see if # is even or odd
		Boolean bEven = (num%2==0); 
		
		if (bEven){
			System.out.println("The number you entered is even.");
		}
		else {
			System.out.println("The number you entered is odd.");
		}
		
		//check if its divisible by 5
		Boolean bDiv = (num%5==0);
		
		if (bDiv) {
			System.out.println("The number you entered is divisible by 5.");
		}
		else {
			System.out.println("The number you entered isn't divisible by 5.");
		}
		
		//extract digits from this number
		int ten = (num / 10);
		System.out.println(ten + " is in the 10s place.");
		
		int one = (num % 10 );
		System.out.println(one + " is in the 1s place.");

		//compare these digits
		if (ten > one) {
			System.out.println("The digit at 10s place is greater than the digit at 1s place.");
		}
		else if (ten < one) {
			System.out.println("The digit at 1s place is greater than the digit at 10s place");
		}
		else {
			System.out.println("Number entered in 10s and 1s place are equal.");
		}
		
		//swap digits
		if (ten > one) {
			int swap0 = one * 10 + ten;
			System.out.println("After swap: "+swap0);
		}
		else if (ten < one) {
			int swap1 = one * 10 + ten;
			System.out.println("After swap: "+swap1);
		}
		else {
			System.out.println("Number entered in 10s and 1s place are equal.");
		}	
		
		s.close();
	}

}
