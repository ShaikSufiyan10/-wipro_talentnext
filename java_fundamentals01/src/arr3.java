import java.util.*;
public class arr3 {
	public static void main(String[] args) {
		
		try (Scanner sc = new Scanner(System.in)) {
			int n=sc.nextInt();
			int arr[]=new int[n];
			
			System.out.println("search value :");
			int ss=sc.nextInt();
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			int count=0;
			for(int i=0;i<n;i++) {
				if(ss==arr[i]) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("match");
			}else {
				System.out.println("not match");
			}
		}
	}

}
