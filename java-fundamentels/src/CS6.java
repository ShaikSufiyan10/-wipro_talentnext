import java.util.*;
public class CS6 {
	public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter gender (Male/Female): ");
        String gender = sc.next();
        System.out.print("Enter age: ");
        int age = sc.nextInt();

	       if (gender.equalsIgnoreCase("Female")) {
	            if (age >= 1 && age <= 58) {
	                System.out.println("Interest: 8.2%");
	            } else if (age >= 59 && age <= 100) {
	                System.out.println("Interest: 9.2%");
	            }
	        } else if (gender.equalsIgnoreCase("Male")) {
	            if (age >= 1 && age <= 58) {
	                System.out.println("Interest: 8.4%");
	            } else if (age >= 59 && age <= 100) {
	                System.out.println("Interest: 10.5%");
	            }
	        } else {
	            System.out.println("Invalid gender");
	        }


}
}