package oops_concept;
import java.util.*;
public class oops6 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String rev=new StringBuilder(str).reverse().toString();
		if(rev.equalsIgnoreCase(rev)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not a palindrome");
		}
	}

}
