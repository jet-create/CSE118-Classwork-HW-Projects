import java.util.Scanner;

public class definevariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// set scanner class, scanner allows me to do the operations below
		Scanner scanner = new Scanner(System.in);
		
		//define my variables x & y
		
		int x = 52;
		System.out.println("x = " +x);
		
		double y = 987.654;
		System.out.println("y = " +y);
		
		// add 101 to the original value of x using augmented assignment op
		
		System.out.println("x = "+(x += 101));
		
		// assign y TO x (use explicit conversion)
		x = (int) y;
		System.out.println("x = "+x);
		
		double z = x*1/2.0 + y*1/3.0;
		System.out.println("z = "+z);
		
		scanner.close();
		
		 
		
	
		
		
	}

}
