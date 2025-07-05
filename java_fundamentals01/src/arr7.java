import java.util.*;

public class arr7 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number of values: ");
            int n = sc.nextInt();

            if (n == 0) {
                System.out.println("Array is empty.");
                return;
            }

            int[] arr = new int[n];

            System.out.println("Enter " + n + " numbers:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            System.out.println("Unique values:");
            System.out.println(arr[0] + " 🙌🙌🙌");

            for (int i = 1; i < n; i++) {
                if (arr[i] != arr[i - 1]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
