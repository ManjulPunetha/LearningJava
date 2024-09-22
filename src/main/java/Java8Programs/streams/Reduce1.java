package Java8Programs.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Reduce1
{
    public static void main(String[] args) {
        List<Integer> num = new ArrayList<>(Arrays.asList(4, 3, 2, 16, -2, 8));
        int sumOfEven = num
                .stream()
                .filter(x -> (x % 2 == 0))
                .reduce(0, Integer::sum);
        System.out.println(sumOfEven);

        int minNumber = num.stream().reduce(0, (x, y) -> x < y ? x : y);
        System.out.println(minNumber);

        int maxNumber = num.stream().reduce(Integer::max).get();
        System.out.println(maxNumber);

        int product = num.stream().reduce(1, (x, y) -> x * y);
        System.out.println(product);

    }
}
