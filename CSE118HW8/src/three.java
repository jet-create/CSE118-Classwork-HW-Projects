import java.util.Scanner;

public class three {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter string: ");
		String ns = sc.nextLine();
		System.out.println(removeSpace(ns));
	}
	
	public static String removeSpace(String input) {
	
		String ns = "";
		boolean removeSpace=false;
		
		for(int i=0; i<input.length();i++){
			if(input.charAt(i)!=' ') {
				removeSpace=false;
				ns+=input.charAt(i);
			}
			/* else if it is a space, 
			enter the if block & if a space hasn't been 
			added remSpace is now true; and a space 
			is added if iterates through again, 
			no space will be added because 
			remSpace=true already
			!removeSpace is checking to see
			if a space has already been added
			if remSpace=false, add space
			if true, wont add space
			*/
			else{
				if(!removeSpace) {
					removeSpace=true;
					ns+=" ";
				}
			}
		}
		return ns;	
		
	
	}
}
