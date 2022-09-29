package day24_loops;

import java.util.Scanner;

public class CharactersInString {
    public static void main(String[] args) {

         /*
    Characters in String
        Given a String print the ascii value codes for each character
        Ex:
        Input:
        java
        Output:
        106 97 118 97
     */

       String word = "Eliza";
       String word2 = "Bagdat";

        for (int i = 0; i < word.length(); i++) {
            System.out.print((int) word.charAt(i) + " ");

            for (int j = 0; j < word2.length(); j++) {
                System.out.print((int) word2.charAt(j) + " ");

            }

            
        }


    }
}
