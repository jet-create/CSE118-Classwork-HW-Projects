
public class four {

	public static void main(String[] args) {

		int randomNum = 100 + (int)(Math.random()* 900);
		System.out.println(ascendingOrder(randomNum) ? System.out.printf("%d is in ascending order.", randomNum) : System.out.printf("%d is not in ascending order.", randomNum));
	}
	
	public static boolean ascendingOrder(int input) {
		
		boolean bisAscending = true;
		input = 100 + (int)(Math.random()* 900);
		if(input>=100&&input<=999) {
			int lastDigit = input%10; // extracts last digit
			input/=10; // gets rid of last digit from number

		for(int i=0; i<=1; i++) {
			int currentDigit = input%10;
			if(currentDigit<=lastDigit) {
				lastDigit = currentDigit; // for next iteration, d100<=d10<=d1!!
			}
			else {
				return false;
			}
			input/=10; // get rid of the next digit
			}
		return true;
		}
		return false;
	}
}

//math random to generate random number
// digits must be ascending sorted (i.e. 1234) 		// do so by extracting digits
// loop it to check if number is sorted 
// if is display
// boolean type method that checks if a number is sorted ascending
//use method and print in main
