public class oops9 {
    public static void main(String[] args) {
        String str = "Coding";

        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0, str.length() / 2));
        } else {
            System.out.println("null");
        }
    }
}
