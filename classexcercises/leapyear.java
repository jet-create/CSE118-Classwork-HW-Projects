package classexcercises;

import java.util.Scanner;

public class leapyear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year:");
		int year = sc.nextInt();
		
		boolean bLeap = (year%4==0) || (year%400==0) && (year%100!=0);
		
		if (bLeap) {
			System.out.println(year + " is a leap year.");
		}
		else {
			System.out.println(year + " is not a leap year.");
			
			sc.close();
	}
		}

}
