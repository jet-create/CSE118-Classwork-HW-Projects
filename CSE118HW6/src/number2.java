import java.util.Random;

public class number2 {

	public static void main(String[] args) {

		Random r = new Random();
		
		char lowercase = (char)r.nextInt('a', 'z'+ 1);
		char digital = (char)r.nextInt('0', '9'+ 1);
		
		if (digital<'5') {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	
		String s = new String("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789");
		int random = r.nextInt(0, 61+1);
		System.out.println(s.charAt(random));
	
	}

}
