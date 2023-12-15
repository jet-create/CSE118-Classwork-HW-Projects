import java.util.Random;

public class number3 {

	public static void main(String[] args) {

		Random r = new Random();
	
		char ch0 = (char)r.nextInt('a', 'z'+1);
		int ascii = (int)ch0;
		System.out.println("letter is "+ch0);
		System.out.println("ASCII code is "+ascii);
		
		char ch1 = (char)(ch0-1);
		int bAscii = (int)ch1;
		System.out.println("letter is "+ch1);
		System.out.println("ASCII code is "+bAscii);
		
		char ch2 = (char)(ch0+3);
		int aAscii = (int)ch2;
		System.out.println("letter is "+ch2);
		System.out.println("ASCII code is "+aAscii);
		
		
		
		
		
	}

}
