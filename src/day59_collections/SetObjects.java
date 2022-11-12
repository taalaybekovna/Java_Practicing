package day59_collections;

import java.util.*;

public class SetObjects {
    public static void main(String[] args) {

        Set<String> str = new HashSet<>();  // does not sort, it works random. Does not allow duplicate
        str.add(null);
        str.add("Muezza");
        str.add("Karash");
        str.add("Animals");
        str.add("Muezza");

        System.out.println(str);

        System.out.println("---------------------------------------------------");

        Set<String> str1 = new LinkedHashSet<>();  // Maintains the order. Does not allow duplicate
        str1.add(null);
        str1.add("Muezza");
        str1.add("Karash");
        str1.add("Animals");
        str1.add("Muezza");

        System.out.println(str1);

        System.out.println("---------------------------------------------------");

        Set<String> str2 = new TreeSet<>();  // Sorts in actual order. Does not allow duplicate
       // str2.add(null);  null does not allowed in TreeSet
        str2.add("Muezza");
        str2.add("Karash");
        str2.add("Animals");
        str2.add("Muezza");

        System.out.println(str2);












    }
}
