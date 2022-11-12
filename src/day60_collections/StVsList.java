package day60_collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StVsList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(6);
        list.add(10);
        list.add(20);
        list.add(4);

        System.out.println("The first index " + list.get(0));
        System.out.println("The last index " + list.get(4));

        System.out.println("-------------------------------------------");

    Set<Integer> set = new HashSet<>();

    set.add(5);
    set.add(20);
    set.add(5);
    set.add(30);

        System.out.println(set); // set doesn't have indexes

        for (int each : set){
            System.out.print(each + " ");
        }




















    }
}
