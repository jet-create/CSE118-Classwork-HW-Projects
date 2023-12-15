import java.util.Scanner;

public class number3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Main Menu: ");
		System.out.println("1: option-1");
		System.out.println("2: option-2");
		System.out.println("3: option-3");
		System.out.println("4: exit");
		System.out.println("Select your option: ");
		int option = s.nextInt();
		
		switch(option) {
		
		case 1: 
			System.out.println("Option 1 is selected.");
			break;
		case 2:
			System.out.println("Option 2 is selected.");
			break;
		case 3:
			System.out.println("Option 3 is selected.");
			break;
		case 4:
			System.out.println("Exit is selected");
			break;
		default:
			System.out.println("Invalid Selection");
		
		s.close();
		
		
		
		
		
		}
		

	}

}
