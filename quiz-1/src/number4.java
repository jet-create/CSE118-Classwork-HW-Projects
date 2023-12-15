import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		//prompt user to enter a 3 digit integer #
		System.out.println("Enter a 3 digit number: ");
		int x = sc.nextInt();
		
		//extract digits at 100,10,and 1
		int no2 = (x /100);
		System.out.println("no2 = "+no2);
		
		//tens place
		int no1 = (x % 100) / 10; 
		System.out.println("no1 = "+no1);

		
		//ones place
		int no0 = (x % 10);
		System.out.println("no0 = "+no0);
		
		//calculate the sum of these values
		int sum = (no2 + no1 + no0);
		System.out.println("The sum of these numbers is: "+sum);
		
		//calculate the average of these values
		double average = ((no2 + no1 + no0)/3.0);
		System.out.println("The average of these numbers is: "+average);
		
		//define int w and assign average value to w 
		int w = (int)average;
		System.out.println("w = "+w);
		
		//round average value to 2 decimal places
		double average0 = (int)((average+0.005) * 100)/100.0;
		System.out.println("Average rounded = "+average0);
		
		sc.close();
		
		
		
		


		
		
	}

}
