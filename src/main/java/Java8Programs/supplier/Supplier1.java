package Java8Programs.supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Supplier1 {
    public static void main(String[] args) {
        System.out.println(evenNumbers.get());
        List<Integer> num = evenNumbers
                .get().stream().filter(greaterThan6)
                .collect(Collectors.toList());
        System.out.println(num);
    }

    static Supplier<List<Integer>> evenNumbers = () ->
            Arrays.asList(2,4,6,8,10,12);

    static Predicate<Integer> greaterThan6 = (number) ->
            number>6;
}
