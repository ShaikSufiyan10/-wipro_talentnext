
public class oop13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          String input = "ab*cd";
          StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            if ((i > 0 && input.charAt(i - 1) == '*') ||
                input.charAt(i) == '*' ||
                (i < input.length() - 1 && input.charAt(i + 1) == '*')) {
                continue;
            }
            result.append(input.charAt(i));
        }

        System.out.println(result.toString());
	}

}
