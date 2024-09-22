package Java8Programs.optional;

import java.util.Optional;

public class Optional1 {
    public static void main(String[] args) {
        Optional optional = Optional.of("Manjul");
        Optional optionalEmpty = Optional.empty();

        System.out.println(optional.isPresent() + "\t" + optionalEmpty.isPresent());
    }
}
