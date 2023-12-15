package classexcercises;

import java.util.Random;

public class chardatatype {

	public static void main(String[] args) {
	
		
		char ch1 = 'C';
		char ch2 = 0x43;
		
		int a = 99;
		int b = 'c';
		
		char ch3 = 'm';
		char ch4 = 'm' + 3;
		char ch5 = 'm' - 1;

		
		Random rand = new Random();
		//generate digital character from (0, 9)
		char ch6 = (char)rand.nextInt(48, 58);
		//generate digital character from (0, 9)
		char ch7 = (char)rand.nextInt('0', '9'+1);
		//generate a letter between A and Z
		char ch8 = (char)rand.nextInt('A', 'Z'+1);
		//generate a letter between a and z
		char ch9 = (char)rand.nextInt('a', 'z'+1);
		
		
		//create a string object
		String str1 = new String("I am a student at SCCC");
		//different way to create string
		String str2 = "Welcome to Java";
		//takes string length
		int len = str1.length();
		//character  at a specific index location
		char ch01 = str1.charAt(0);
		//character at last place
		char ch02 = str1.charAt(str1.length()-1);
		//character at middle 
		char ch03 = str1.charAt(str1.length()/2);
		//put a string together
		String str5 = str2 + str1 + "CS";
		
		return;
	}

}
	//generate charatcer that is a digital char uppercase or lowercase