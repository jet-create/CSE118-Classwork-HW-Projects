import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		//(a)	Prompt user to enter a 4-digit integer number.
		System.out.println("4-digit integer number: ");
		int num = s.nextInt();
		//(b)	Extract all digits from this number, display these digits.
		int num3 = (num/1000);
		System.out.println("Thousands Place = "+num3);
		int num2 = (num / 100) % 10; 
		System.out.println("Hundreds Place = "+num2);
		int num1 = (num % 100) / 10; 
		System.out.println("Tens Place = "+num1);
		int num0 = (num % 10); 
		System.out.println("Ones Place = "+num0);
		//used if else statement to see if the digits were > or < 5
		int g = 0;
		int l = 0;
		
		if (num0 >= 5) {
			g++;
		}
		else {
			l++;
		}
		if (num1 >= 5) {
			g++;
		}
		else {
			l++;
		}
		if (num2 >= 5) {
			g++;
		}
		else {
			l++;
		}
		if (num3 >= 5) {
			g++;
		}
		else {
			l++;
		}
		System.out.println(g+ " digits are greater than 5.");
		System.out.println(l+ " digits are less than 5.");

		//conditional assignment operator, ? means if and : means or 
		System.out.println(num3 + " is" + (num3 % 2 == 0 ? " even" : " odd"));
		System.out.println(num2 + " is" + (num2 % 2 == 0 ? " even" : " odd"));
		System.out.println(num1 + " is" + (num1 % 2 == 0 ? " even" : " odd"));
		System.out.println(num0 + " is" + (num0 % 2 == 0 ? " even" : " odd"));

		s.close();
		}
	

}








/*if (num3 > 5) {
System.out.println(num3+ " is greater than 5.");
}
else {
System.out.println(num3+ " is less than 5.");
}
if (num2 > 5) {
System.out.println(num2+ " is greater than 5.");
}
else {
System.out.println(num2+ " is less than 5.");
}
if (num1 > 5) {
System.out.println(num1+ " is greater than 5.");
}
else {
System.out.println(num1+ " is less than 5.");
}
if (num0 > 5) {
System.out.println(num0+ " is greater than 5.");
}
else {
System.out.println(num0+ " is less than 5.");
}*/