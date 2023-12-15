package project1;

import java.util.Scanner;

public class project {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Main Menu: \n");
		System.out.print("1: Binary to Decimal & Hexdecimal\n");
		System.out.print("2: Hexdecimal to Binary & Decimal\n");
		System.out.print("3: Decimal to Binary & Hexdecimal\n");
		System.out.print("4: Exit\n");
		System.out.print("\nSelect your choice: ");
		
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		
		case 1: 
			option1(sc);
			break;
		case 2: 
			option2(sc);
			break;
		case 3:
			option3(sc);
			break;
		case 4: 
			System.out.println("You have exited the program.\nThank You!");
			break;
		default: 
			System.out.println("Invalid selection.");
		}
		
		sc.close();
	}

	public static void option1(Scanner sc) {
		
		System.out.println("\nOption 1 was selected.");
		String binary;
		boolean valid = false;
		
		do {
			System.out.println("Enter a Binary value: ");
			binary = sc.nextLine();
			valid = validateBinary(binary);
			
			if(!valid) {
				System.out.println("Invalid value. Please try again.");
			}
		} while(!valid);
		
		
		System.out.printf("Binary #: %s\nHex: #: %s\nDecimal #: %s", binary, binaryToHex(binary), binaryToDecimal(binary));
		}

	
	public static void option2(Scanner sc) {
		
		System.out.println("\nOption 2 was selected.");
		String hexadecimal;
		boolean valid = false;
		
		do {
			System.out.println("Enter a Hexadecimal value: ");
			hexadecimal = sc.nextLine();
			valid = validateHexadecimal(hexadecimal);
			
			if(!valid) {
				System.out.println("Invalid value. Please try again.");
			}
		} while(!valid);
				
		System.out.printf("Hexadecimal #: %s\nBinary: #: %s\nDecimal #: %s", hexadecimal, hexToBinary(hexadecimal), hexToDecimal(hexadecimal));
	}
	
	
	public static void option3(Scanner sc) {
		
		System.out.println("\nOption 3 was selected.");
		String decimal;
		boolean valid = false;
		
		do {
			System.out.println("Enter a Decimal value: ");
			decimal = sc.nextLine();
			valid = validateDecimal(decimal);
			
			if(!valid) {
				System.out.println("Invalid value. Please try again.");
			}
		} while(!valid);
		
		
		System.out.printf("Decimal #: %s\nHex: #: %s\nBinary #: %s", decimal, decimalToHex(decimal), decimalToBinary(decimal));
	}
	
	public static String binaryToDecimal(String str) {
		
		String toDecimal = "";
		int decimal = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			decimal = decimal * 2 + (ch - '0');
		}
		
		while(decimal > 0) {
			char ch = (char)(decimal % 10 + '0');
			toDecimal = ch + toDecimal;
			decimal /= 10;
		}
		return toDecimal;
	}
	
	public static String binaryToHex(String str) {
		
		binaryToDecimal(str);
		return decimalToHex(str);
	}
	public static String decimalToHex(String str) {
		
		String toHex = ""; 
		int hexDecimal = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			hexDecimal = hexDecimal * 10 + (ch - '0');
		}
		
		while(hexDecimal>0) {
			int remainder = hexDecimal % 16;
			char ch = (char)((remainder < 10) ? '0' + remainder : 'A' + (remainder - 10));
			hexDecimal /= 16;
			toHex+=ch;
		}
		return toHex;
	}
	
	public static String decimalToBinary(String str) {
	
		String toBinary = "";
		int binary = 0;
		
		for(int i = 0;i < str.length();i++){
			char ch = str.charAt(i);
			binary = binary * 10 + (ch - '0');
		}
		
		if(binary == 0) {
			return "0";
		}
		
		while(binary > 0) {
			int remainder = (binary % 2);
			toBinary = (char)(remainder + '0') + toBinary;
			binary/=2;
		}
		return toBinary;
	}
	
	public static String hexToDecimal(String str) {
		
		String toDecimal = "";
		int decimal = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0'&&ch<='9') {
				decimal = decimal * 16 + (ch - '0');
			}
			else {
				decimal = decimal * 16 + (ch - 'A' + 10);
			}
		}
		
		while(decimal > 0) {
			int remainder = (char)(decimal % 10);
			toDecimal = remainder + toDecimal;
			decimal /= 10;
			
		}
		return toDecimal;
	}
	
	public static String hexToBinary(String str) {
		
		hexToDecimal(str);
		return decimalToBinary(str);
	}
	
	public static boolean validateBinary(String str) {
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch != '0' && ch != '1') {
				return false;
			}
			else {
				continue;
			}
		}
		return true;
	}
	
	public static boolean validateDecimal(String str) {
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9') {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static boolean validateHexadecimal(String str) {
		
		for(int i = 0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= '0' && ch <= '9' || ch >= 'A' && ch <= 'F') {
				continue;
			}
			else {
				return false;
			}
		}
		return true;
	}
}
