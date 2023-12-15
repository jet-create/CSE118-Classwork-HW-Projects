import java.util.Random;

public class number7 {

	public static void main(String[] args) {
		
		Random r = new Random();
		
		//range becomes (65, 90)
		int fL = 65 + (int)(Math.random()* 26);
		int sL = 65 + (int)(Math.random()* 26);
		int tL = 65 + (int)(Math.random()*26);
		//range becomes (0, 10)
		int fN = (int)(Math.random()*10);
		int sN = (int)(Math.random()*10);
		int tN = (int)(Math.random()*10);
		int foN = (int)(Math.random()*10);

		System.out.println(" "+(char)fL+(char)sL+(char)tL+"-"+fN+sN+tN+foN);
		
		
	}

}
