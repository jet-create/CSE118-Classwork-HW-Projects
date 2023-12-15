import java.util.Scanner;

public class define4ints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		//define pos1-pos4
		System.out.println("Enter four digits:");
        int pos1 = sc.nextInt();
        int pos2 = sc.nextInt();
        int pos3 = sc.nextInt();
        int pos4 = sc.nextInt();		
		/* display “pos1={a-number}; pos2={a-number}; pos3={a-number}; 
		pos4={a-number}”*/
		System.out.println("Normal Order");
		System.out.println("pos1 = "+pos1);
		System.out.println("pos2 = "+pos2);
		System.out.println("pos3 = "+pos3);
		System.out.println("pos4 = "+pos4);
		
		/*left shit the values pos2 to pos1, pos3 to pos2, pos4 to pos3, 
		and move data in pos1 to pos4. */
		
		int temp = pos1;
		pos1 = pos2;
		pos2 = pos3;
		pos3 = pos4;
		pos4 = temp;
		System.out.println("Left shift");
		System.out.println("pos1 = "+pos1);
		System.out.println("pos2 = "+pos2);
		System.out.println("pos3 = "+pos3);
		System.out.println("pos4 = "+pos4);
		
		/*pos1 to pos2, pos2 to pos3, pos3 to pos4, 
		and move data in pos4 to pos1*/
		temp = pos1;
        pos1 = pos4;
        pos4 = pos3;
        pos3 = pos2;
        pos2 = temp;		
        System.out.println("Right shift");	
		System.out.println("pos1 = "+pos1);
		System.out.println("pos2 = "+pos2);
		System.out.println("pos3 = "+pos3);
		System.out.println("pos4 = "+pos4);
		
		sc.close();

	}

}
