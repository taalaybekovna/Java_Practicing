package day59_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListObjects {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(null);
        list.add("a");

        System.out.println(list);
        System.out.println(list.get(2));


        List<String> list1 = new LinkedList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");
        list1.add(null);
        list1.add("a");

        System.out.println(list1);
        System.out.println(list1.get(2));
    }

}
