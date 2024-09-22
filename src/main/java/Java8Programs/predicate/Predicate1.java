package Java8Programs.predicate;

import java.util.function.Predicate;

public class Predicate1 {
    public static void main(String[] args) {
        Predicate<String> isPhoneNumberValid = (phoneNum) ->
                phoneNum.startsWith("98") && phoneNum.length() > 5;
        System.out.println(isPhoneNumberValid.test("985647"));
        System.out.println(isPhoneNumberValid.test("185644"));

        Predicate<String> isPhoneNumberContain3 = (phoneNum) ->
                phoneNum.contains("3");

        System.out.println(isPhoneNumberValid.and(isPhoneNumberContain3).test("983647"));
        System.out.println(isPhoneNumberValid.and(isPhoneNumberContain3).test("985647"));

        //negate
        Predicate<Integer> isMinor = (age) -> age < 18;
        System.out.println("Is adult? " + isMinor.negate().test(56));
    }
}
