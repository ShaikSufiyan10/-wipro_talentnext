import java.util.Scanner;

public class que11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter color code (R/B/G/O/Y/W): ");
        char code = sc.next().toUpperCase().charAt(0);

        switch (code) {
            case 'R': System.out.println("Red"); break;
            case 'B': System.out.println("Blue"); break;
            case 'G': System.out.println("Green"); break;
            case 'O': System.out.println("Orange"); break;
            case 'Y': System.out.println("Yellow"); break;
            case 'W': System.out.println("White"); break;
            default: System.out.println("Invalid ");
        }
    }
}
