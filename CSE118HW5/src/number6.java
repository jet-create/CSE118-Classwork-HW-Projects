import java.util.Scanner;

public class number6 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the exchange rate from U.S. dollars to Japanese Yen: ");
		double exchangeRate = s.nextDouble();
		System.out.println("Enter 0 to convert U.S. dollars to Yen, or enter 1 to convert Yen to U.S. dollars: ");
		int choice = s.nextInt();
		
		switch (choice) {
		
		case 0:
			System.out.println("Enter the U.S. dollar amount: ");
			double usd = s.nextDouble();
			double c0 = (usd * 146.27);		
			double c0Rounded = Math.ceil(c0 * 100) / 100.0;
			System.out.println(usd + " is " + c0Rounded + " Yen");
			break;
		case 1: 
			System.out.println("Enter the Yen amount: ");
			double yen = s.nextDouble();
			double c1 = (yen / 146.27);
			double c1Rounded = Math.ceil(c1 * 100) / 100.0;
			System.out.println(yen + " is " + c1Rounded + " USD");
			break;
			
		default:
			System.out.println("Invalid.");

		
		s.close();
		
		
		
		
		
		}
	}

}
