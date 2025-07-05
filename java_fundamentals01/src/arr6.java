import java.util.*;
public class arr6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		Arrays.sort(arr);
		int sce_min=arr[1];
		int sce_max=arr[n-2];
		System.out.println("second min: "+sce_min);
		System.out.println("second max: "+sce_max);
		
		

	}

}
