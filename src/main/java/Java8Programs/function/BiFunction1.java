package Java8Programs.function;

import java.util.function.BiFunction;

public class BiFunction1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> areaOfRectangle = (length, breadth) -> length * breadth;
        int areaOfRect = areaOfRectangle.apply(5, 4);
        System.out.println(areaOfRect);
    }
}
