package Java8Programs.function;

import java.util.function.Function;

public class Function1 {
    public static void main(String[] args) {
        Function<Integer, Double> areaOfCircle = (radius) -> 3.14 * radius * radius;
        Double area = areaOfCircle.apply(2);
        System.out.println(area);
        System.out.println(area(2));

        //andThen() method
        Function<Double, Double> multiplyByTen = (num) -> (num * 10);
        Function<Integer, Double> calculateAreaAndMultiplyByTen = areaOfCircle.andThen((multiplyByTen));
        Double finalResult = calculateAreaAndMultiplyByTen.apply(2);
        System.out.println(finalResult);

    }

    public static Double area(int radius) {
        return 3.14 * radius * radius;
    }
}
