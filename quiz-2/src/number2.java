import java.util.Scanner;

public class number2 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		double vertexX1 = 0.0;
		double vertexY1 = 0.0;
		double halfx1 = 5.0; 
		double halfy1 = 2.5;
		
		System.out.println("Enter x-coordinate: ");
		double xcp1 = s.nextInt();
		System.out.println("Enter y-coordinate: ");
		double ycp1 = s.nextInt();

		boolean inrecX = Math.abs(xcp1 - vertexX1) <= halfx1;
        boolean inrecY = Math.abs(ycp1 - vertexY1) <= halfy1;
        
       if (inrecX&&inrecY) {
    	   System.out.println("The coordinate entered is within the rectangle.");
       }
       else {
    	   System.out.println("The coordinate entered isn't within the rectangle.");

       }
       s.close();
	}

}
