package Extra_tasks.NestedIfStatement;

import java.util.Scanner;

public class Age {
    /*
    declare and assign an age variable

use these ranges to determine which age group you belong to

	if the given age value is less than 0 or more than 120:
		print: Invalid age

	otherwise, uses these to determine the age group

		Baby (2 years and below)
		Toddler (3 - 5)
		Kid (6 - 9
		Pre-Teen (10 - 12)
		Teenager (13 - 17)
		Young Adult (18 - 20)
		Adult (21 - 35)
		Middle-Aged Adult (36 - 55)
		Senior Citizen (55+)
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = input.nextInt();

        if (age >= 1){
            if (age > 2){
                System.out.println("baby");
            } else if (age > 3){
                System.out.println("Toddler");
            } else if (age < 6){
                System.out.println("Kid");
            } else if (age < 10){
                System.out.println("Pre - Teen");
            } else  if (age < 13){
                System.out.println("Teenager");
            } else if (age < 18){
                System.out.println("Young Adult");
            } else if (age < 21){
                System.out.println("Adult");
            } else if (age < 36){
                System.out.println("Middle-Aged Adult");
            } else if (age > 55){
                System.out.println("Senior Citizen");
            } else {
                System.out.println("Citizen");
            }

        } else {
            System.out.println("Invalid age");
        }













    }
}
