package midtermcse118;

public class number5 {

	public static void main(String[] args) {
		
		double x = -1000.0 + Math.random() * 9999.0;
		
		if (x < 0) {
			double p1 = ((4/5.0) * x * x) - ((3/4.0) * x) + 3/2.0;
			System.out.printf("f(%f) = %.2f", x, p1);
		}
		else if (0<=x&&x<9) {
			double p1 = 3/2.0;
			System.out.printf("f(%f) = %.2f", x, p1);
		}
		else {
			double p1 = ((2/3.0) * Math.sqrt(x)) - 1/2.0;
			System.out.printf("f(%f) = %.2f", x, p1);
		}
		
	}

}
