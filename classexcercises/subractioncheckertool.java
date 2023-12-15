package classexcercises;

import java.util.Scanner;

public class subractioncheckertool {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two numbers: ");
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		
		if (num1<num2){
			System.out.println(num2 + " - " + num1 + " = ?");
		}
		else {
			System.out.println(num1 + " - " + num2 + " = ?");		
			
		}	
				
		int answer = sc.nextInt();
		
		int result = num1 - num2;
		
		boolean bCorrect = result == answer;
		
		if (bCorrect) {
			System.out.println("Your answer is correct.");
		}
		else {
			System.out.println("Your answer is incorrect.");
		}
		
		sc.close();
		
	}

}
