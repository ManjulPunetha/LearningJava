package Java8Programs.lambda;

import Java8Programs.lambda.FunctionalInterface.Square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        Square square = (int x) -> ans.add(x * x);


        Square square1 = (int x) -> ans.add(x * x * x);
        List<Integer> inputNumbers = Arrays.asList(2,3,4,7,8,5);
//        for(int i = 0;i<inputNumbers.size();i++){
//            ans.add(square.power(inputNumbers.stream().filter(x->x%2==0).collect(Collectors.toList()).get(i)));
//        }
        System.out.println(ans.stream().collect(Collectors.toList()));
    }
}
