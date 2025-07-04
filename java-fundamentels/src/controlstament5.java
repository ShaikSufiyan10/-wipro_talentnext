import java.util.Scanner;

public class controlstament5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter values separated by space: ");
        String input = sc.nextLine();

        if (input.trim().isEmpty()) {
            System.out.println("No values");
        } else {
            String[] words = input.trim().split("\\s+");
            for (int i= 0; i < words.length; i++) {
                System.out.print(words[i]);
                if (i < words.length - 1)
                    System.out.print(",");
            }
        }

        sc.close();
    }
}
