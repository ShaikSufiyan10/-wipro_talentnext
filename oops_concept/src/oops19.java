import java.util.*;

public class oops19 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");
        StringJoiner sj = new StringJoiner(", ", "{", "}");
        names.forEach(sj::add);
        System.out.println(sj.toString());
    }
}
