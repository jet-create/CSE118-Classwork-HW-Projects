import java.util.Scanner;

public class number6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//prompt user to enter length in mm
		System.out.println("Millimeters = ");
		int millimeters = sc.nextInt();
		
		//convert number into meters + cm + mm
		int m = millimeters / 1000;
		
		//remainder of that is equal to cm
		int cm = (millimeters % 1000) / 10;
		
		//remainder of cm to get mm
		int mm = millimeters % 10;
		
		//print out meters + cm + mm
		System.out.println(m + " Meters " + cm + " Centimeters " + mm + " Millimeters");
		
		sc.close();
	
		
	}

}
