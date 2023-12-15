package classexcercises;
import java.util.Scanner;

public class definingvariablszxy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set scanner
		Scanner scanner = new Scanner(System.in);
		
		//define my variables
		int x = 10;		
		
		double y = 20;
		
		short z = 28;
		
		
		/* take half of x then a third of y then a fourth of z
		 * then add them all together to get w
		 */
		
		double w = 1.0/2.0*x + 1.0/3.0*y + 1.0/4.0*z;
		System.out.println("w = " +w);
		
		//assign w to a int variable a
		// use (int) to convert w which is a double into an int
		
		int a = (int) w;
		System.out.println("a = " +a);
		
		
		
		scanner.close();

	}

}
