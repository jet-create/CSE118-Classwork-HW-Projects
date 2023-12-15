package project1;

import java.util.Scanner;

public class projectnotes {
	/*
	
	*decimal to hex*
	step 1: set dec = 0;
	*in loop*
	step 2: extract char
	step 3: char to decimal values
	step 4: dec = dec * 16 + v (v is decimal value (i.e. 'A' = 10))
	-'0' to get a digital char from '0'-'9'
	-'A'+10 to get char from 'A'-'F'
	
	String toHex = ""; 
	Scanner j = new Scanner(System.in);
	System.out.println("Enter a number: ");
	int n = j.nextInt();
	int m = n; ?
	while(n>0) {
		int rem = n%16;
		n/=16;
		char ch = (char)((rem < 10) ? '0'+rem : 'A'+(rem-10));
		toHex+=ch;
	}
	System.out.printf("decimal number %d = 0x%s\n", m, toHex);
	j.close();
	*decimal to binary*
	int binary = 0;
	int place = 1;
	for(int i=0;i>0;i++){
		int rem = input%2;
		input/=2;
		binary+=rem*place;
		place*=10;
	}
	
	
	hexdecimal to decimal - done 
	hexdecimal to binary (hextodec decbin)
	
	*do binary to hexdecimal by doing hex-dec then dec-bin* 
	do binary to decimal bin-hex then makes it dec-hex
	
	
	
	
	
	
	*/
	
}
