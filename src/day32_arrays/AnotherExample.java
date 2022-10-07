package day32_arrays;

import java.util.Arrays;

public class AnotherExample {

    public static void main(String[] args) {

        String [] [] words = {
                {"Kitep", "Book", "Kniga"},
                {"Asman", "Bulut", "Ai"}
        };

        for (String [] eachArray : words){
            for (String eachWord : eachArray){

                System.out.println(eachWord.charAt(eachWord.length()));
            }
        }









    }
}
