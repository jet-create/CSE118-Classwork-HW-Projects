package classexcercises;

import java.util.Random;
import java.util.Scanner;
public class lottery {

	public static void main(String[] args) {
		
		Random r = new Random();
		int lottery = r.nextInt(100);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your lottery number: ");
		int user = sc.nextInt();
		
		//10000 = same numbers same order
		if (user == lottery) {
			System.out.println("You win $10000!");
			}
		
		else {
			//lottery == d1d2
			int d1 = lottery / 10;
			int d2 = lottery % 10;
			
			//answer d3d4
			int d3 = user / 10;
			int d4 = user % 10;
			
		//for $3000, 3000 = same numbers diff order
		if ((d1 == d3) && (d2 == d4)) {
			System.out.println("You win $3000!");
			}
		else if (d1 == d3||d1 == d4 || d2 == d3||d2 == d4) {
			System.out.println("You win $1000!");
		}
		else {
			System.out.println("Try again");

		}
			
			
			
			
		}
	
	
	}


}
