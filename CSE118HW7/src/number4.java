import java.util.Random;
public class number4 {

	public static void main(String[] args) {

		Random rand = new Random();
		
		double Double = rand.nextDouble(-1000.0, 1000.0 + 1);
		double randDouble = Math.round(Double);
		System.out.println("Number: "+randDouble);
		System.out.println("Square: "+Math.round((Math.pow(randDouble, 2))* 100.0)/100.0);
		System.out.println("Cube: "+Math.round((Math.pow(randDouble, 3))* 100.0)/100.0);
		System.out.println("Square root: "+Math.round((Math.sqrt(randDouble))*100.0)/100.0);
		
		
	}

}
