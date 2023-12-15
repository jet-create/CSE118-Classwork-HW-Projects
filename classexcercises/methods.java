package classexcercises;

public class methods {
	
	public static void main(String[] args) {
		
		listAllPrimeNumbers(2,1000);
		
	}
	//list all prime numbers in the range [2, 1000]
	//void means method will not return anything
	public static void listAllPrimeNumbers(int a, int b){
		
		int ct = 0;
		for(int i = a; i<=b; i++) { 
			if (isPrime(i)) {
				System.out.printf("%d ", i);
				ct++;
				
				if (ct%10==0)
					System.out.println();
			}
		}
	}
	public static void listAllPrimeNumbers2(int a, int b) {
	
		for(int i=a; i<=b; i++) {
			boolean bisPrime = true;
			for(int j=2; j<=i/2; j++) {
				if(i%j==0) {
					bisPrime = false;
					break;
				}
			}
			if(bisPrime)
				System.out.printf("%d ", i);
		}
}
	
	
	
	
	public static boolean isPrime (int n) {
		boolean bReturn = true;
			for(int i = 2; i<n/2; i++) {
				if (n%i==0) {
					bReturn = false;
					break;
				}
			}
			return bReturn; 
		//can just return false instead of breaking out
		/*boolean bReturn = true;
		for(int i = 2; i<n/2; i++) {
			if (n%i==0) {
				return false;
		}
	}
		return true;*/
		//return true because bReturn is false meaning that number is prime number meaning that isPrime is true
		
}
	//calculate sum from a - b 
	/*a and b are our inputs/parameters, 
	 output name (inputs) - format
	 public static = visible modifier
	*/
	public static int sum(int a, int b) {
		
		int returnValue = 0;
		for (int i = a; i<=b; i++) {
			// returnValue = returnValue + i
			returnValue+=i;
		}
		
		return returnValue;
		
	}
	
	public static double max(double a, double b) {
		
		double maxVal = a;
		if (maxVal<b) 
			maxVal = b;
			
		return maxVal;
		
	}
	

	
}
