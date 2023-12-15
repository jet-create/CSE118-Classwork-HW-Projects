package classexcercises;

import java.util.Scanner;

public class convertingtemperatures {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set scanner class (scanner allows the operations we ill be using
		Scanner scanner = new Scanner(System.in);
		
		// prompt user to enter the temp in farenheit
		System.out.print("What is the temperature in farenheit?: ");
		double farenheit = scanner.nextDouble();
		
		/* plug in celsius equation
		 * add .0 at the end of the digits bc it's a DOUBLE
		 * add celsius into the final statement for complete answer
		 */
		double celsius = (5.0/9.0) * (farenheit-32.0);
		System.out.print("Temperature in Celsius is " +celsius);
		
		scanner.close();

	}

}
