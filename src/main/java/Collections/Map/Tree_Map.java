package Collections.Map;



import java.util.Map;
import java.util.TreeMap;

public class Tree_Map {
    public static void main(String[] args) {
        Map<Integer,String> map = new TreeMap<>();
        map.put(1,"Hello");
        map.put(3,"World");
        map.put(2,"Manjul");
        System.out.println(map);
    }
}
