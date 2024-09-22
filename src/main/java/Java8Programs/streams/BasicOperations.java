package Java8Programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class BasicOperations
{
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(4, 5, 1, 3, 7, 9, 2, 6);
        num.stream()
                .filter(n -> n % 2 == 0)
                .map(n -> n * 3)
                .forEach(System.out::println);

        int secondSmallest = num.stream()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();

        System.out.println("secondSmallest: " + secondSmallest);


    }
}
