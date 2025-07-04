import java.util.*;
public class CS7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner sc = new Scanner(System.in);
		        char ch = sc.next().charAt(0);

		        if (Character.isLowerCase(ch)) {
		            System.out.println("o/p: " + Character.toUpperCase(ch));
		        } else if (Character.isUpperCase(ch)) {
		            System.out.println("o/p: " + Character.toLowerCase(ch));
		        } else {
		            System.out.println("Not an alphabet");
		        }
		    }
		


	}


