package Java8Programs.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortedExample {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana", "Mango", "Watermelon", "Apple", "Grape");

        //ascending sort different ways
        //  #1
        List<String> sortedList1 = fruits.stream()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList1);

        //  #2
        List<String> sortedList2 = fruits.stream()
                .sorted((o1, o2) -> o1.compareTo(o2))
                .collect(Collectors.toList());
        System.out.println(sortedList2);

        //  #3
        List<String> sortedList3 = fruits.stream()
                .sorted().collect(Collectors.toList());
        System.out.println(sortedList3);


        //descending sort different ways
        //  #1
        List<String> sortedList4 = fruits.stream()
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(sortedList4);

        //  #2
        List<String> sortedList5 = fruits.stream()
                .sorted((o1, o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
        System.out.println(sortedList5);

    }
}
