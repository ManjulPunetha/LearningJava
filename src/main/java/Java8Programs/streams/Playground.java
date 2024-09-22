package Java8Programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Playground
{
    public static void main(String[] args) {
        //Find the second smallest and largest elements in a list of integers using streams.
        List<Integer> numbers = Arrays.asList(4, 56, 7, 90, 2, 33, 65);

        int largestNum = numbers.stream()
                .max((x, y) -> x.compareTo(y))
                .get();
        int largestNum2ndMethod = numbers.stream()
                .reduce(Integer.MIN_VALUE, (x, y) -> x > y ? x : y);
        System.out.println("largestNum: " + largestNum);
        System.out.println("largestNum2ndMethod: " + largestNum2ndMethod);

        int secondSmallest = numbers.stream()
                .distinct()
                .sorted((x, y) -> y.compareTo(x))
                .collect(Collectors.toList())
                .stream()
                .skip(1)
                .findFirst().orElse(0);
        System.out.println("secondSmallest: " + secondSmallest);
    }
}
