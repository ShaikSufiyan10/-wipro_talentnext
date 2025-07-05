import java.util.*;

public class arr8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int sum = 0;
        boolean skip = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 6) skip = true;
            if (!skip) sum += arr[i];
            if (arr[i] == 7 && skip) skip = false;
        }

        System.out.println("Sum: " + sum);
    }
}
