package Regex_tutorial;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pgm1 {
    public static void main(String[] args) {
        String text = "619";
        String re = "\\d\\d";
        Pattern pattern = Pattern.compile(re);
        Matcher matcher = pattern.matcher(text);
        System.out.println("Does string matches the regex pattern? " +matcher.matches());

        //other ways
        System.out.println(Pattern.matches("\\d{6,}","788989"));

    }
}
