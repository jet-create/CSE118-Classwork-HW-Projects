import java.util.Random;
public class number6 {

	public static void main(String[] args) {
		
	Random r = new Random();
	//list A...F-9
	String fourHex = new String("ABCDEF0123456789");
	int d1 = r.nextInt(16);
	int d2 = r.nextInt(16);
	int d3 = r.nextInt(16);
	int d4 = r.nextInt(16);
	
	System.out.printf("0x%X%X%X%X", d1, d2, d3, d4);
	
	//[0, 15] 
	//if (random < 10)
		
		
		
		
		
		
		
		
	}

}
