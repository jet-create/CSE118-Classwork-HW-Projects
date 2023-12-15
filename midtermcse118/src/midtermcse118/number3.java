package midtermcse118;

import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {
		
		Scanner j = new Scanner(System.in);
		
		System.out.println("Enter a number in the range of 1,000 - 9,999: ");
		int num = j.nextInt();
		
		boolean bNum = num<1000;
		boolean bNum2 = num>9999;
		if (bNum) {
			num = 1000;
		} 
		else if (bNum2) {
			num = 9999;
		}
		else {
			
		}
		
		if (num % 5 == 0 ^ num % 9 == 0) {
			System.out.println("Num is divisible by 5 or 9 but not both.");
		}
		else {
			System.out.println("Num is divisible by both.");
		}
		
		int num0 = num / 1000;
		int num1 = (num / 100) % 10;
		int num2 = (num % 100) / 10;
		int num3 = num % 10;
		System.out.printf("Digit in thousands: %d ", num0);
		System.out.printf("\nDigit in hundreds: %d ", num1);
		System.out.printf("\nDigit in tens: %d ", num2);
		System.out.printf("\nDigit in ones: %d ", num3);
		
		int smallest = num0; 
		if (smallest > num1) {
			smallest = num1;
			System.out.printf("\nSmallest digit is %d.\n", smallest);
		}
		else if (smallest > num2) {
			smallest = num2;
			System.out.printf("\nSmallest digit is %d.\n", smallest);
		}
		else if (smallest > num3) {
			smallest = num3;
			System.out.printf("\nSmallest digit is %d.\n", smallest);
		}
		else {
			System.out.printf("\nSmallest digit is %d.\n", smallest);
		}
		
		/* Correct Solution
		 
		 int smallest = num0;

		if (smallest > num1) {
    	smallest = num1;
		}
		if (smallest > num2) {
    	smallest = num2;
		}
		if (smallest > num3) {
    	smallest = num3;
		}
		System.out.printf("\nSmallest digit is %d.\n", smallest);
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		if (num0 == num1 || num0 == num2 || num0 == num3) {
			System.out.println("There is a duplicate digit.");
		}
		else if (num1 == num0 || num1 == num2 || num1 == num3) {
			System.out.println("There is a duplicate digit.");
		}
		else if (num2 == num0 || num2 == num1 || num1 == num3) {
			System.out.println("There is a duplicate digit.");
		}
		else if (num3 == num0 || num3 == num1 || num3 == num2) {
			System.out.println("There is a duplicate digit.");
		}
		else {
			System.out.println("There is no duplicate digit.");
		}

		j.close();
		
		
	}

}
