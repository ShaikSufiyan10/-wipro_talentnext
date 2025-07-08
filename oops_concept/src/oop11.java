
public class oop11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hio";
		String b="byeeee";
		String shortstr =a.length()<b.length()?a:b;
		String longstr=a.length()<b.length()?b:a;
		String res = shortstr+longstr+shortstr;
		System.out.println(res);

	}

}
