package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        String [] items = {"Shoes", "Jackets", "Gloves", "Airpods", "IPad"};

        // Do we have jackets in stock?

        Scanner input = new Scanner(System.in);
        System.out.println("Do we have jackets in stock? ");
        int num = input.nextInt();

        System.out.println(items[num]);


    }
}
