package day19_String;

import java.util.Scanner;

public class Initials {
    /*
            Ask the user to enter their first name
            Ask the user to enter their last name
            Print the initials as uppercase letters

            james
            bond
            JB
         */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String name = input.next();

        System.out.println("Please enter your last name");
        String lastName = input.next();

        name = name.toUpperCase();
        lastName = lastName.toUpperCase();

        System.out.println("" + name.charAt(0) + lastName.charAt(0));


















    }

}
