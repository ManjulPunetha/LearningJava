import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HelloWorld {
    public static void main(String[] args) {
        List marks = new ArrayList();
        marks.add("Math");
        marks.add(12);
        marks.add("Science");
        marks.add(17);
        Iterator ie = marks.iterator();
        while (ie.hasNext()) {
            System.out.println(ie.next());
        }

    }
}
