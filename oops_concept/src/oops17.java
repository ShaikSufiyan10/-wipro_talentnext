import java.util.Optional;

public class oops17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String address=null;
		Optional<String> optAddress= Optional.ofNullable(address);
		System.out.println(optAddress.orElse("India"));

	}

}
