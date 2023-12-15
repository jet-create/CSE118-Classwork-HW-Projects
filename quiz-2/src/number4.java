import java.util.Scanner;

public class number4 {

	public static void main(String[] args) {

		int num1= 100 - (int)(Math.random()*201);
		int num2 = 100 - (int)(Math.random()*201);
		
		findGreater(num1, num2);
		divBy(num1, num2);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		countDigitalChar(str);
		removeDigitalChar(str);
		fixStringGrammar(str);
	}

	
	public static String findGreater(int num1, int num2) {
		
		String greater = (num1>num2) ? "num1 is greater.\n num2 is smaller.":"num2 is greater.\n num1 is smaller.";
		return greater;
	}
	
	public static int divBy(int num1, int num2) {
	
		int nums=0;
		for(int i = num1; i<=num2; i++) {
			if(i%7==0^i%11==0) {
				System.out.print(i + " ");
				nums++;
				if(nums%12==0) {
					System.out.println(); // print a new line
				}
			}
		}
		return nums;
	}
	
	public static int countDigitalChar(String str) {
		
		int digCount = 0;
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0'&& ch <= '9') {
				digCount++;
			}
		}
		System.out.printf("%d digital chars\n", digCount);
		return digCount;
	}
	
	public static String removeDigitalChar(String str) {
		
		String ns = "";
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z') {
				ns+=ch;
			}
		}
		System.out.println(ns);
		return ns;
	}
	
	public static String fixStringGrammar(String str) {
		
		String newString = "";
		boolean capitalize = true;
		int i;
		for(i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(i==0||str.charAt(i-1)==' '||str.charAt(i-1)=='.') {
				newString+=(char)(ch-'a'+'A');
				capitalize = true;
			}
			else {
				newString += capitalize ? (char)(ch-'A'+'a') : (char)(ch-'a'+'A');
				capitalize = !capitalize;
			}
		}
		System.out.println("new string is: " + newString);
		return newString;
	 }
	
}


