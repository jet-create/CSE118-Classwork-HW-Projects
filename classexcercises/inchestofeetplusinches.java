package classexcercises;

import java.util.Scanner;

public class inchestofeetplusinches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set scanner class
		Scanner sc = new Scanner(System.in);
		
		//convert inches to feet + inches
		System.out.print("Enter inches: ");
		int inches = sc.nextInt();
		
		//12 inches in a foot
		int feet = inches / 12; 
		
		//after we divide inches by 12 we need the remainder of that
		int inch =  (inches % 12);
		
		System.out.println(inches + " inches = " + feet + "feet and " + inch + "inches");
		
		sc.close();
	}

}
