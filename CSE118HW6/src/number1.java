import java.util.Scanner;

public class number1 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is the value of x?");
		double x = s.nextDouble();
		if (x<1) {
			double part1 = ((0.75 * (x * x * x) - 0.5));
			System.out.println("f("+x+") = "+part1);
		}
		else if (1<=x&&x<4) {
			System.out.println("f("+x+") = 0.25");
		}
		else {
			double part1 = (Math.sqrt(x) - 1.75);
			double p1round = (int)((part1 + 0.005) *100 ) / 100.0;
			System.out.println("f("+x+") = "+p1round);
	}
		s.close();
}
}
