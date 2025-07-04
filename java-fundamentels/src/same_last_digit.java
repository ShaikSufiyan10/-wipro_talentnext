import java.util.*;
public class same_last_digit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=a%10;
		int d=b%10;
		if(c==d) {
			System.out.println("true");
		}
		else {
			System.out.println("flase");
			
		}
		sc.close();

	}

}
