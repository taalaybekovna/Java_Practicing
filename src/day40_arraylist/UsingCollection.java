package day40_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UsingCollection {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Osh", "Bishkek", "London", "New York"));
        Collections.sort(words);
        System.out.println(words);
        Collections.reverse(words);
        System.out.println(words);

        System.out.println("-------------------------------------------------------------------");

        ArrayList<Integer> digits = new ArrayList<>();
        digits.addAll(Arrays.asList(23, 44, 12, 31, 8, 20));
        Collections.sort(digits);
        System.out.println(digits);
        Collections.reverse(digits);
        System.out.println(digits);
        System.out.println(Collections.max(digits));
        System.out.println(Collections.min(digits));
        Collections.swap(digits, 0, 5);
        System.out.println(digits);

        System.out.println("------------------------------------------");

        ArrayList<Integer> digits2 = new ArrayList<>(Arrays.asList(20, 30, 50, 80, 50, 90, 100, 50));
        System.out.println(Collections.frequency(digits2, 50));

        ArrayList<String > words2 = new ArrayList<>(Arrays.asList("Samara", "Moscow", "Osh", "Atamerek", "Osh", "Bishkek"));
        System.out.println(Collections.frequency(words2, "Osh"));











    }
}
