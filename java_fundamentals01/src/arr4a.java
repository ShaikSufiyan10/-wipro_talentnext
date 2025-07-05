import java.util.*;

public class arr4a {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			int n = sc.nextInt();
			int[] ascii = new int[n];

			System.out.println("Enter ASCII values:");
			for (int i = 0; i < n; i++) ascii[i] = sc.nextInt();

			System.out.print("Characters: ");
			for (int i = 0; i < n; i++) System.out.print((char) ascii[i] + " ");
		}
    }
}
