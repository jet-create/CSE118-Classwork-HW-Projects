package classexcercises;

import java.util.Scanner;

public class addistioncheckertool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); 
		
		//step 1: ask user to enter two integer numbers
		System.out.print("Enter two numbers: ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		// step 2: generate question and ask user to enter
		System.out.println(num1 + " + " + num2 + " = ?");
		
		
		//step 3: user answers question
		int answer = sc.nextInt(); 
		
		
		//step 4: check if is correct display result
		int result = num1 + num2;
		boolean bCorrect = result == answer;
		
		if (bCorrect){
				System.out.println("Your answer is correct.");
		}
		else {
				System.out.println("Your answer is incorrect.");
		}
		
		sc.close();
		
	}

}
