package Java8Programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctValue
{
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ram","Shyam","Sohan","Sandeep","Rahul","Ram","Sandeep");

        List<String> distinctnames = names.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctnames);

        names.stream().distinct().forEach(x->System.out.println(x));
    }
}
