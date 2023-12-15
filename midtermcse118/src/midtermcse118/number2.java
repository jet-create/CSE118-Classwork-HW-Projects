package midtermcse118;

import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {

		Scanner j = new Scanner(System.in);
		
		System.out.println("Enter 2 double numbers: ");
		double num1 = j.nextDouble();
		double num2 = j.nextDouble();
		
		if (num1 > num2) {
			int num3 = (int)num1;
			System.out.println("Num3 is "+num3);
		}
		else {
			int num3 = (int)num2;
			System.out.println("Num3 is "+num3);
		}
		
		double num1Truncate = Math.floor(num1 * 100) / 100 ;
		System.out.println("Num1 truncated is: "+num1Truncate);
		System.out.printf("Num2 rounded is %.2f", num2);

		j.close();
		
		
	}

}
