import java.util.Random;

public class number1 {

	public static void main(String[] args) {
		
		Random r = new Random();

		int num0 = r.nextInt(-99, 99 + 1);
		int num1 = r.nextInt(-111, 111+1);
		double num2 = r.nextDouble(-20.0, 20.0 + 1.0);
		
		int num3 = -99 + (int)(Math.random()*99);
		int num4 = -111 + (int)(Math.random()*111);
		double num5 = -20.0 + (int)(Math.random()*20.0);
	}

}
