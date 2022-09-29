package day25_loops;

import java.util.Scanner;

public class CreateId {
    /*
    Create ID [String]

    Given a first name and last name create and return an id using the following format:
	the first letter of the first name as lowercase,
	the first 3 letters of the last name with the first letter as uppercase and the rest lowercase,
	the length of the first String multiplied by 2

	first name: john
	last name: smith

	id: jSmi8
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name please: ");
        String firstName = scan.next().toLowerCase();

        System.out.println("Enter your last name please: ");
        String lastName = scan.next().toLowerCase();

        String id = firstName.substring(0,1);
        id += lastName.substring(0,1).toUpperCase();
        id += lastName.substring(1,3).toLowerCase();
        id += firstName.length() * 2;

        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("ID: " + id);

















    }
}
