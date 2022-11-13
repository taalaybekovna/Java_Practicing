package day61_HashMap;

import java.util.*;

public class AllObjects {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Eliza", "Bagdat");
        map.put("Jyrgal", "Guliza");
        map.put("Elnura", "Abdurahman");
        map.put("Upol", "Beksultan");
        map.put("Tannur", null);
        System.out.println(map);

        System.out.println("-----------------------------------");

        Map<String, String> linked = new LinkedHashMap<>();
        linked.put("Eliza", "Bagdat");
        linked.put("Jyrgal", "Guliza");
        linked.put("Elnura", "Abdurahman");
        linked.put("Upol", "Beksultan");
        linked.put("Tannur", null);
        System.out.println(linked);

        System.out.println("-----------------------------------");

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.put("Eliza", "Bagdat");
        treeMap.put("Jyrgal", "Guliza");
        treeMap.put("Elnura", "Abdurahman");
        treeMap.put("Upol", "Beksultan");
       // treeMap.put(null, "Tannur"); TreeMap doesn't accept a null (NullPointerException)
        System.out.println(treeMap);

        System.out.println("-----------------------------------");

        Map<String, String> hashTable = new Hashtable<>();
        hashTable.put("Eliza", "Bagdat");
        hashTable.put("Jyrgal", "Guliza");
        hashTable.put("Elnura", "Abdurahman");
        hashTable.put("Upol", "Beksultan");
        // treeMap.put(null, "Tannur"); TreeMap doesn't accept a null (NullPointerException)
        System.out.println(hashTable);











    }
}
