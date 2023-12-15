import java.util.Scanner;

public class number5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//prompt user to enter a double #
		System.out.print("Decimal number: ");
		double x = sc.nextDouble();
		
		//extract integer from double #
		int x0 = (int) x;
		System.out.println("Integer = "+x0);
		
		//truncate to 3 decimal places
		float x1 = (float) (x - x0);
		System.out.println("Decimal = "+x1);
		
		//truncate to 3 decimal places
		double x2 = (int)(x * 1000)/1000.0;
		System.out.println("Decimal rounded = "+x2);
		
		//truncate to 3 decimal places but round up
		double x3 = (int)((x+0.0005)*1000)/1000.0;
		System.out.println("Decimal rounded up = "+x3);
		
		sc.close();
		
		
		
		
		
		
		sc.close();
	}

}
