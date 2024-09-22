package Regex_tutorial;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Pgm2 {
    public static void main(String[] args) {
        String text = "My email id is : manjul@gmail.com,rohan_yadav@yahoo.com,rahul12@gmail.comjason@gmail.com";
        String regex = "[\\w\\d]+@\\w+.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        List<String> emails = new ArrayList<>();

        while (matcher.find()) {
            emails.add(matcher.group());
        }
        if (emails.size() == 0)
            System.out.println("No emails found");
        else
            System.out.println("Total matches: " + emails.size() + "\n" +
                    "Emails found: " + emails);


    }
}
