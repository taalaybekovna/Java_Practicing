package day31_arrays;

import java.util.Arrays;

public class JoinExample {
    public static void main(String[] args) {

        String [] words = {"Bagdat", "Eliza", "Muezza", "HAPPY", "FAMILY"};

        System.out.println(Arrays.toString(words));
        System.out.println(String.join("", words));
        System.out.println(String.join("*", words));
        System.out.println(String.join("+",  words));

    }
}
