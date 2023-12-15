
public class number2 {

	public static void main(String[] args) {
	
		int vw = 1 + (int)(Math.random()*99);
		int vx = 1 + (int)(Math.random()*99);
		int vy = 1 + (int)(Math.random()*99);
		int vz = 1 + (int)(Math.random()*99);
		
		int greatest = vw;
		
		if (greatest < vx) {
			greatest = vx;
			System.out.println("Greatest value is in variable vx, value is: "+vx);
		}
		else if (greatest < vy) {
			greatest = vy;
			System.out.println("Greatest value is in variable vy, value is: "+vy);
		}
		else if (greatest < vz){
			greatest = vz;
			System.out.println("Greatest value is in variable vz, value is: "+vz);
		}
		else {
			System.out.println("Greatest value is in variable vw, value is: "+vw);
		}
		
		int greatestV = Math.max(Math.max(Math.max(vw, vx), vy), vz ); 
		System.out.println("Greatest value is in variable "+greatestV );
		}
	
	
	}


