import java.util.Optional;

public class oops16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] names=new String[5];
		Optional<String> name = Optional.ofNullable(names[0]);
		System.out.println(name.map(String::length).orElse(0));

	}

}
