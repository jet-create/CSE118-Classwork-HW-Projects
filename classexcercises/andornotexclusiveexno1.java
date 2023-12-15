package classexcercises;

import java.util.Random;
import java.util.Scanner;

public class andornotexclusiveexno1 {

	public static void main(String[] args) {
		
		Random ra = new Random();
		int n1 = ra.nextInt();
		//[ 0, 10) - range 
		int n2 = ra.nextInt(10);
		// [-10, 10) range
		int n3 = ra.nextInt(-10, 10);
		
		double d1 = ra.nextDouble();
		double d2 = ra.nextDouble(100.0);
		double d3 = ra.nextDouble(-100.0, 100.0);

		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int x = sc.nextInt();
		
		//check if x is divisible by 2 and 3
		boolean bCorrect = (x%2==0) && (x%3==0);
		
		if (bCorrect) {
			System.out.println( x +" is divisible by 2 or 3.");
		}
		else {
			System.out.println(x +" isn't divisible by 2 or 3.");
		}
		//check if x is divisible by 2 or 3
		if ((x%2==0) || (x%3==0)) {
			System.out.println(x + " is divisble by 2 or 3.");
		}
		else {
			System.out.println(x + " isn't divisble by 2 or 3.");
		}
		//check if x is divisible by 2 or 3 but not both
		if (x%2==0 ^ x%3==0) {
			System.out.println(x + " is divisble by 2 and 3 but not both");
		}
		else {
			System.out.println(x + " isn't divisble by 2 and 3.");
		}
		
		sc.close();
}
	
	
	
	
	
	


}