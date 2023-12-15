import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		//driving distance
		System.out.println("How many miles is the trip?");
		double miles = s.nextDouble();
		//miles per gallon
		System.out.println("How many miles per gallon does your get?");
		double mpg = s.nextDouble();
		//price per gallon
		System.out.println("What is the price per gallon?");
		double ppg = s.nextDouble();
		//cost of the trip
		double cost = (miles/mpg) * ppg;
		//round to 2 decimal places
		double c0 = (int)((cost+0.005)*100)/100.0;
		System.out.println("The total cost of your trip is $"+c0);
		
		s.close();
		
	}

}
