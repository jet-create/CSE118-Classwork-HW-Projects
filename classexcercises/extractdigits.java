package classexcercises;

import java.util.Scanner;

public class extractdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//extract digits from 3-digit #
		System.out.print("Extract digits from: ");
		int x = sc.nextInt();
		
		
		//hundreds place
		int no2 = (x /100);
		System.out.println("no2 = "+no2);
		
		//tens place
		int no1 = (x % 100) / 10; 
		System.out.println("no1 = "+no1);

		
		//ones place
		int no0 = (x % 10);
		System.out.println("no0 = "+no0);

		sc.close();
	}

}
