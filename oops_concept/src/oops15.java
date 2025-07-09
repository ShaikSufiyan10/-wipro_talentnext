public class oops15{
    public static void main(String[] args) {
        String str = "Wipro";
        int n = 3;

        String lastPart = str.substring(str.length() - n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            result.append(lastPart);
        }

        System.out.println(result.toString());
    }
}
