import java.util.Scanner;

public class number5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int vertX = 0;
		int vertY = 0;
		int radius = 10;
		
		System.out.println("Enter x-coordinate: ");
		int xcp1 = s.nextInt();
		System.out.println("Enter y-coordinate: ");
		int ycp1 = s.nextInt();
		
		//distance formula
		double distance = Math.sqrt(Math.pow(xcp1 - vertX, 2)+ Math.pow(ycp1-vertY, 2));
        
        if (distance <= radius) {
     	   System.out.println("The coordinate entered is within the circle.");
        }
        else {
     	   System.out.println("The coordinate entered isn't within the circle.");

     	   s.close();
	}

}
}













