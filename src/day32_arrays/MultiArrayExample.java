package day32_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        System.out.println("-----------------Single Array---------------------------------");

        int [] a = {2022, 1990, 1987};
        int [] b = {03, 8, 29};

        System.out.println(Arrays.toString(a)); // This is single
        System.out.println(Arrays.toString(b)); // This is single

        System.out.println("---------------Multidimensional Array---------------------");

        int [] [] multi = {a, b};

        System.out.println(Arrays.deepToString(multi)); // This is multidimensional Array









    }
}
