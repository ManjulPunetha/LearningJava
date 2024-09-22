package Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Hello");
        map.put(3,"World");
        map.put(2,"Manjul");
        map.put(4,"Hi");
        System.out.println(map.entrySet());


    }
}
