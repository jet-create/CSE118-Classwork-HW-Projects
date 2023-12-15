import java.util.Scanner;

public class number5 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//prompt user to enter int number in ounces
		System.out.println("Enter ounces: ");
		int toz = sc.nextInt();
		
		//convert ounces into pounds, 16 ounces in a pound
		int lbs = toz / 16;
		
		//get whats left of the oz
		int oz = toz % 16;
		System.out.println(toz + " Total Ounces = " + lbs + " Pounds " + oz + " Ounces ");

		sc.close();
	}

}
