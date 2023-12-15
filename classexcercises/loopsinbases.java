package classexcercises;

import java.util.Scanner;

public class loopsinbases {
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int ct = 0;
		for(int i = 1; i<=10000;i++) {
			
			boolean bisPrime = true;
			ct++;
			for(i=2;i<n/2;i++) {
				if (n%i==0) {
				bisPrime = false;
				break;
			}
		if (ct%10==0) {
			System.out.println();
		}
	}
}
		
		
	}

	public static void reverseString(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//method 1: reverse string
		String ns = "";
		String in = s.nextLine();
		for(int i = 0;i<in.length();i++) {
			ns = in.charAt(i) + ns;
		}
		if (ns.equals(in)) {
			System.out.println("is palindrome");
		}
		int r;
		for (r =1;r<=100;r++)
			
			if (r>=10 && r<=20) 
				continue;
		
		System.out.printf("%d", r);
		
		//method 2: check original by comparing chars
		boolean palindrome = true; 
		for(int j = 0; j < in.length()/2;j++) 
			if (in.charAt(j)!=in.charAt(in.length()-1-j)){
				palindrome = false;
				break;
		}
		
		System.out.printf("the string %d is a palindrome\n", ((palindrome) ? "is" : "is not"));
		
	}
	
	
	public static void numberConversion(String[] args) {
	
		String toHex = ""; 
		Scanner j = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = j.nextInt();
		int m = n;
		while(n>0) {
			int rem = n%16;
			n/=16;
			char ch = (char)((rem < 10) ? '0'+rem : 'A'+(rem-10));
			toHex = ch + toHex;
		}
		System.out.printf("decimal number %d = 0x%s\n", m, toHex);
		j.close();
	}


}
	



	
