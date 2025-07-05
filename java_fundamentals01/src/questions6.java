import java.util.*;
public class questions6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
	        System.out.print("Enter values separated by space: ");
	        String input = sc.nextLine();

	        if (input.trim().isEmpty()) {
	            System.out.println("No values");
	        } else {
	            String[] values = input.split("\\s+");
	            for (int i = 0; i < values.length; i++) {
	                System.out.print(values[i]);
	                if (i < values.length - 1)
	                    System.out.print(",");

	}

}
}}