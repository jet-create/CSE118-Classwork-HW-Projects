import java.util.Random;

public class number1 {

	public static void main(String[] args) {

		Random r = new Random();
		
		//(a) number in the range of [0, 111)
		int a = r.nextInt(112);
		//(b)	a number in range [-1000, 1000]
		int b = r.nextInt(-1000,1001);
		//(c)	a number in range [10, 99]
		int c = r.nextInt(10, 100);
		//(d)	a double number in range [11.0, 99.0)
		double d = r.nextDouble(11.0, 100.0);
		//print
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);

	}

}
