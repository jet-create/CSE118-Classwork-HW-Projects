import java.util.Scanner;

public class cuboidvolume {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//set scanner sc
		Scanner sc = new Scanner(System.in);

		//prompt user to enter w, l , and h
		System.out.print("The Width of this Cuboid is: ");
		double w = sc.nextDouble();
		
		System.out.print("The Length of this Cuboid is: ");
		double l = sc.nextDouble();
		
		System.out.print("The Height of this Cuboid is: ");
		double h = sc.nextDouble();
		
		double volume = (w * l * h);
		System.out.println("Volume of Cuboid = "+volume);
		
		sc.close();
	}

}
