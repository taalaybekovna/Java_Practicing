package day25_loops;

import java.util.Scanner;

public class CamelCase {
     /*
    Camel Case

    Given a String with multiple words separated by spaces, create a camel case version of the words.
     Every word, except the first word, begin with an uppercase letter.
      The other characters of the word will be lowercase

    Ex:

        Today is SUNDAY

        Output:

        todayIsSunday

     */
     public static void main(String[] args) {

         Scanner input = new Scanner(System.in);
         System.out.println("please enter your sentence: ");
         String word = input.nextLine().toLowerCase();
         String camelCase = word.substring(0, 1);


         for (int i = 1; i < word.length(); i++) {
             if (word.charAt(i-1) == ' '){

                 camelCase += word.substring(i , i + 1).toUpperCase(); //("" + str.charAt(i)).toUpperCase(). sub(i , i + 1) is the same as charAt(i) but the types are different

             } else {
                 camelCase += word.charAt(i); //today
             }

         }

         System.out.println(camelCase.replace(" ", "")); // delete the spaces

     }
}
//    if(i != 0 && str.charAt(i - 1) == ' '){

