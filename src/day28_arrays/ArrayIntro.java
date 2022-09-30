package day28_arrays;

import java.util.Arrays;

public class ArrayIntro {
    public static void main(String[] args) {


        // with normal variables
        String city = "London";
        String city2 = "Osh";
        String city3 = "Philadelphia";

        // declare array with values
        String[] cities = {"London", "Osh", "Philadelphia"};
        String [] cities2 = {city,city2,city3};

        // how to access each element in the array
        System.out.println(cities);// this doesn't print the Array
        System.out.println(cities[0]);
        System.out.println(cities[1]);
        System.out.println(cities[2]);

        // print all the cities in one line
        System.out.println("Reverse order of the cities: " + cities[2] + ", " + cities[1] + ", " + cities[0]);
        System.out.println("Cities " + Arrays.toString(cities)); // this method from Arrays class lets you print the array fully

        // number of elements or values
        System.out.println(cities.length);






    }
}
