public class oops8 {
    public static void main(String[] args) {
        String str = "Wipro";
        int n = str.length();

        String part = str.length() < 2 ? str : str.substring(0, 2);
        String result = "";

        for (int i = 0; i < n; i++) {
            result += part;
        }

        System.out.println(result);
    }
}
