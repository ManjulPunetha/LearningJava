package Java8Programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample {
    public static void main(String[] args) {
        List<String> stringNum = Arrays.asList("1", "2", "3", "4");
        List<Integer> nums = stringNum.stream()
                .map(n -> Integer.parseInt(n))
                .collect(Collectors.toList());

        System.out.println(nums);
    }
}
