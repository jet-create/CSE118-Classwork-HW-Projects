 public class HW {

	public static void main(String[] args) {
		
		listAllNums(1, 21, 4);
		System.out.println();
		
		generateRandomNumber(1, 5);
		System.out.println();
		
		generateChar('c', 'f');
		System.out.println();
		
		checkHexDecimal("0x98FA");
		System.out.println();

		convertSecondstoHHMMSS(10000);
		System.out.println();

		computeSum(9);
		System.out.println();

		getAsciiTable('0', '9');
		getAsciiTable('A', 'Z');
		getAsciiTable('a', 'z');
	}

	
	public static int listAllNums(int low, int upp, int numPerLine) {
		// list all nums divisible by 3&7 (within specific range)
		//pass a parameter that indicates # of nums per line
		//return how many nums found in range
		
		// generate random num withtin a range
		
		// want a num counter gives if %3^7 within the range
		// low is our start, upp is the end
		// numsperline is based on numsDiv%numperline
		//focus on syntax!!
		int numsDiv=0;
		
		for(int i=low; i<=upp;i++) {
			if(i%3==0^i%7==0) { 
				numsDiv++;
				System.out.printf("%d\t", i); // prints out number + a space
			
				if(numsDiv%numPerLine==0) {
					System.out.println(); //moves to next line after display
				}
		}
	}
		return numsDiv;
	}
	
	public static int generateRandomNumber(int lowerBound, int upperBound) {
		// generate a random number and return it 
		int r = lowerBound + (int)(Math.random() * (upperBound - lowerBound + 1)); // - lb and + 1 to include ub
		System.out.printf("random number is: %d\n", r);
		return r;
	}
	
	public static char generateChar(char ch1, char ch2) {
		
		char generate = (char)(ch1+(int)(Math.random()*(ch2 - ch1 + 1)));
		System.out.printf("random char is: %c\n", generate);
		return generate;
		
	}
	
	public static boolean checkHexDecimal(String str) {
		
		boolean checkHexDecimal = true;
		if(str.charAt(0)=='0'&&str.charAt(1)=='x') {
			checkHexDecimal = true;
			for(int i = 2;i<str.length();i++) {
				char ch = str.charAt(i);
				if(ch>='0'&&ch<='9'||ch>='A'&&ch<='F') {
					checkHexDecimal = true;
				}
				else {
					checkHexDecimal = false;
					break;
				}
			}
		}
		else {
			checkHexDecimal = false;
		}
		
		if(checkHexDecimal) {
			System.out.println("This is a valid hexdecimal.");
		}
		else {
			System.out.println("This is not a valid hexdecimal.");
		}
		
		return checkHexDecimal;
	}
	
	public static String convertSecondstoHHMMSS(int seconds) {
		
		
		String time = "";
		//figure out the time
		int hours = seconds/3600;
		int minutes = (seconds%3600)/60;
		int secs = (seconds%3600)%60;
		//design values into strings
		if(hours<10) {
			time += "0" + hours;
		}	else {
			time += hours;
		}
		
		time += ':';
		
		if(minutes<10) {
			time += "0" + minutes;
		}	else {
			time += minutes;
		}
		
		time += ':';
		
		if(secs<10) {
			time += "0" + secs;
		}	else {
			time += secs;
		}
		System.out.printf("%d seconds is %s", seconds, time);
		return time;
	}
	
	public static double computeSum(int n) {
		
		double sum = 0;
		for(int i = 1; i<=n; i++) {
			sum+=(double)(i-1)/i;
		}
		System.out.printf("\nsum is %.2f", sum);
		return sum;
	}
	
	public static String getAsciiCode(char ch, boolean isDecimal) {
		
		int ascii = (int)ch;
		if(isDecimal) {
			return decimalToString(ascii);
		} else {
			return "0x" + decimalToHex(ascii);
		}
	}
	
	public static String decimalToString(int num) {
	
		String toString = "";
		while(num>0) {
			// extract last digit of num and convert to char
			char digitToChar = (char)('0'+(num%10));
			toString = digitToChar + toString;
			num/=10;
		}
		return toString;
	}
	public static String decimalToHex(int num) {
	
		String toHex = ""; 
		int n = num; 
		while(n>0) {
		int rem = n%16;
		n/=16;
		char ch = (char)((rem < 10) ? '0' + rem : 'A' + (rem - 10));
		toHex+=ch;
		}
		return toHex;
	}
	
	public static void getAsciiTable(char low, char up) {
		
		System.out.println("\nchar\tdec\thex");
		System.out.println("===================");
		
		for(char ch = low; ch <= up; ch++) {
			String decimal = getAsciiCode(ch, true);
			String hex = getAsciiCode(ch, false);
			System.out.printf("%c\t%s\t%s\n", ch, decimal, hex);
			
		}
	}
}
