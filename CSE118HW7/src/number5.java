import java.util.Scanner;
public class number5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
	
		System.out.println("Enter number of cents (0-99): ");
		int cents = s.nextInt();
		
		int quarters = cents / 25;
		//remainder of what's left after you take quarters
		cents %= 25;
		int dimes = cents / 10;
		//remainder of what's left after you take dimes
		cents %= 10;
		int nickels = cents / 5;
		//remainder of what's left after you take pennies
		int pennies = cents % 5;
		
		System.out.println("Quarters: "+quarters);
		System.out.println("Dimes: "+dimes);
		System.out.println("Nickels: "+nickels);
		System.out.println("Pennies: "+pennies);
		
		s.close();
		
	
	
	
	}

}
