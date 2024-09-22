package Collections.Set;


import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Tree_Set {
    public static void main(String[] args) {
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(1);
        set1.add(5);
        set1.add(7);
        set1.add(4);
        set1.add(3);
        set1.add(8);
//        System.out.println(set1);
        TreeSet<Integer> set2 = new TreeSet<>();
        set2.add(11);
        System.out.println(set2);
    }
}
