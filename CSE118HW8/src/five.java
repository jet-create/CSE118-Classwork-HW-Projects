
public class five {

	public static void main(String[] args) {
		
		int r = 1 + (int)(Math.random()*1000000);
		
		System.out.printf("Original value is: %d", r);
		System.out.printf("\nReversed order is: %d", reverseDigits(r));
		System.out.printf("\nSum of all values is: %d", addAllDigits(r));
		System.out.printf("\nOdd Values: %d", checkOdd(r));
		System.out.printf("\nEven Values: %d", checkEven(r));
		
	}
	
	public static int addAllDigits(int input) {
		// extract all digits from number and add them
		int sum = 0;
		while(input>0) {
			int extractDigit = input%10;
			sum+=extractDigit;
			input/=10;
		}
		return sum;
	}
	
	public static int reverseDigits(int input) {
		// reverse order of digits
		int revDigit = 0;
		while(input>0){
			int extractDigit = input%10;
			revDigit = revDigit * 10 + extractDigit;
			input/=10;
		}
		return revDigit;
	}
	
	public static int checkOdd(int input) {
		// check odd numbers
		int oddCount = 0;
		while(input>0) {
			int extractDigit = input%10;
			input/=10;
			if(extractDigit%2!=0)
				oddCount++;
		}
		return oddCount;
	}
	
	public static int checkEven(int input) {
		// check even numbers
		int evenCount = 0;
		while(input>0) {
			int extractDigit = input%10;
			input/=10;
			if(extractDigit%2==0)
				evenCount++;
		}
		return evenCount;
	}
	
	
	
}
