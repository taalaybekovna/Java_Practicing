package day61_HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapObject {
    public static void main(String[] args) {


        Map<Integer, String> map = new HashMap<>();
        map.put( 1 , " Muezza");
        map.put( 3 , " Kitten");
        map.put( 2 , " Myshyk");
        System.out.println(map);
        System.out.println(map.get(2)); // Myshyk
        System.out.println(map.remove(1));
        System.out.println(map);
        System.out.println(map.containsKey(1));
        System.out.println(map.containsKey(2));












    }
}
