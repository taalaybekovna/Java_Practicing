package Extra_tasks.Scanner_practice;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {

       // Write a program that asks the user to enter a price and quantity and then calculate the revenue. revenue = price × quantity.

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a price of your product: ");
        double price = scan.nextDouble();
        System.out.println("Now enter a quantity of the product: ");
        int quantity = scan.nextInt();
        double revenue = 0;

        System.out.println("It is $" + (revenue = price * quantity));




    }
}
