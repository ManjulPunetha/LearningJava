package Collections.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Rohan","Sohan","Alb","Jerry","Mit","Tak"));
        for(int i = 0;i<=6;i++)
        {
            if(names.get(i).charAt(0) == 'A'){
                System.out.println("You are first");
            }
        }
    }
}
