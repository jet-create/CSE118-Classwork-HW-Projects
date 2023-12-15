package classexcercises;

import java.util.Scanner;

public class evenoddchecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//step 1 ask user to enter integer number (num is the # user inputs)
		System.out.print("Enter a number: ");
		int num = sc.nextInt();
		
		//step 2 set boolean variable 
		
		boolean bTrue = num %2 == 0;
		
		//check if # has a % of 0
		if (bTrue)
			System.out.println("The number " + num + " is even");
		else
			System.out.println("The number " + num + " is odd");

	}

}
