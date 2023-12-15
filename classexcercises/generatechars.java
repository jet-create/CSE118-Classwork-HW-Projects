package classexcercises;

public class generatechars {

	public static void main(String[] args) {

		char ch1 = generateDigitalChar();
		char ch2 = generateUpperCaseLetter();
		char ch3 = generateLowerCaseLetter();
	}

	public static char generateDigitalChar() {
//		return (char)('0' + (int)(Math.random() * ('9' - '0' +1)));
		return generateChar('0', '9');
	}
	
	public static char generateUpperCaseLetter() {
//		return (char)('A' + (int)(Math.random() * ('Z' - 'A' +1)));
		return generateChar('A', 'Z');
	}
	
	public static char generateLowerCaseLetter() {
// 		return (char)('a' + (int)(Math.random()	* ('z' - 'a' +1)));
		return generateChar('a', 'z');
	}

	public static char generateChar(char low, char upp) {
//		int rn = (int)(Math.random() * (upp - low +1));
//		char ch = (char)(low + rn);
//		return ch;
		return (char)(low + (int)(Math.random() * (upp - low +1)));
	}
	
}
