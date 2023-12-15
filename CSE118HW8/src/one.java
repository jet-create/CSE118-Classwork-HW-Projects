public class one {

	public static void main(String[] args) {
		
		int n = 6 + (int)(Math.random() * 4);
		System.out.printf("sum of part a series is %f\n", sumSeries(n));
		System.out.printf("sum of part b series is %f", sumAlternateSign(n));
		
	}
	
	public static double sumSeries(int n){
		// display the sum of 1 + 1/2 + 1/3 + 1/4 + … + 1/n
		// parameter is int n
		double sum = 0.0;
		for(int i=1; i<=n; i++) {
			sum+=1.0/i;
		}
		return sum;
	}
	
	public static double sumAlternateSign(int n) {
		// display the sum of 1 - 1/2 + 1/3 - 1/4 +/- … + 1/n
		double sum = 0.0;
		int sign = 1;
		for(int i=1; i<=n; i++) {
			sum+=(1.0/i)*sign;
			sign = -1*sign; // change sign for next iteration
		}
		return sum;
	}

	

}
