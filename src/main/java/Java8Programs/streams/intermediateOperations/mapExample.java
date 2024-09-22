package Java8Programs.streams.intermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class mapExample {
    public static void main(String[] args) {
        List<String> name = Arrays.asList("Manjul", "Rahul", "Ali", "Alexander");

        List<Integer> sizeOfName;
        sizeOfName = name.stream()
                .map(String::length)
                .collect(Collectors.toList());
        System.out.println(sizeOfName);
    }
}
