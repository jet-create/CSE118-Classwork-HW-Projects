package classexcercises;

import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What is your BMI: ");
		double bmi = sc.nextDouble();
		
		if (bmi<18.5) { 
			System.out.println("You are underweight.");
		}
		else if (bmi<25) {
			System.out.println("You are at normal weight.");
		}
		

	}
	






}