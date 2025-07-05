import java.util.*;

public class arr11  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        boolean isValid = true;

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] != 1 && arr[i] != 4) {
                isValid = false;
            }
        }

        System.out.println("All are 1 or 4? " + isValid);
    }
}
