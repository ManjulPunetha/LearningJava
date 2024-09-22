package Java8Programs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllMatchExample
{
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(4, 10, 2, 16, -2, 8));
        boolean allEven = num.stream().allMatch(x -> x % 2 == 0);
        System.out.println(allEven);
    }
}
