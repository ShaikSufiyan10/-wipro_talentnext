
public class oop12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String str = "xHix";

        if (str.startsWith("x")) {
            str = str.substring(1);
        }

        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        System.out.println(str);

	}

}
