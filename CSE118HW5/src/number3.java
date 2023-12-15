import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//prompt user to enter a #
		System.out.println("Enter a number: ");
		int user = s.nextInt();
		
		boolean num0 = (user<11);
		boolean num1 = (user>99);
		//(a), if else to adjust number
		if (num0) {
			user = 11;
			System.out.println("Number is "+user);
		}
		else if (num1){
			user = 99;
			System.out.println("Number is "+user);
		}
		else {
			System.out.println("Number is "+user);
		}
		//(b), user conditional assignment operator to adjust the number
		int number = (user < 11) ? 11 : (user > 99) ? 99 : user;
        System.out.println("Number is "+number);
		
		s.close();

		
	}

}
