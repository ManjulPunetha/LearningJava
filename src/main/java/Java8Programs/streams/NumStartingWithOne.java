package Java8Programs.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumStartingWithOne
{
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,12,34,54,56,67,18,17,45,10);
        List<Integer> ans = input.stream().map(s->Integer.toString(s))
                .filter(i->i.startsWith("1")).map(Integer::parseInt)
                .collect(Collectors.toList());
        System.out.println(ans);
    }
}
