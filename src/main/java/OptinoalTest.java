import java.util.Optional;

public class OptinoalTest {
    public static void main(String[] args) {
        Optional optional =Optional.empty();
        optional.ifPresent(i -> System.out.println(i));
    }
}
