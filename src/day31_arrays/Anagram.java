package day31_arrays;

import java.util.Arrays;

public class Anagram {
/*

        given two Strings
        find if they are anagram or not

        the characters are the same in both Strings, but the order is different

        listen
        silent

     */

    public static void main(String[] args) {

        String word1 = "listen";
        String word2 = "silent";

        char [] one = word1.toCharArray();
        char [] two = word2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);


       System.out.println("It is: " + Arrays.equals(one,two));


        System.out.println("if else----------------------------------------------------");


        if(Arrays.equals(one, two)){
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }

        System.out.println("Ternary ---------------------------------------------------------");

        System.out.println(Arrays.equals(one, two) ? "Anagram" : "Not Anagram");






    }
}
