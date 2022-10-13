package day37_wrapper_arraylist;

import java.util.ArrayList;

public class ArraylistExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println(numbers);

        numbers.add(300);
        System.out.println(numbers);
        numbers.get(0);
        System.out.println(numbers);
        numbers.remove(0);
        System.out.println(numbers);
        System.out.println(numbers.add(5));
        System.out.println(numbers.size());
    }
}
