package day32_arrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        System.out.println("-----------------Single Array---------------------------------");

        int [] a = {2022, 1990, 1987};
        int [] b = {03, 8, 29};

        System.out.println("Single: " + Arrays.toString(a)); // This is single
        System.out.println("Single: " + Arrays.toString(b)); // This is single

        System.out.println("---------------Multidimensional Array---------------------");

        int [] [] multi = {a, b};

        System.out.println("2D: " + Arrays.deepToString(multi)); // This is multidimensional Array


        System.out.println("-------------------Multi 2 example-----------------");

        int [] [] multiTwo = {
                {10, 20, 30},  //  index 0 Array
                {40, 50, 60},  //  index 1 Array
                {70, 80, 90}   //  index 2 Array
        };

        System.out.println(Arrays.deepToString(multiTwo));
        System.out.println(Arrays.toString(multiTwo[0]));
        System.out.println(Arrays.toString(multiTwo[1]));
        System.out.println(Arrays.toString(multiTwo[2]));
        System.out.println(multiTwo.length);
        System.out.println(multiTwo[0].length);
        System.out.println(multiTwo[1].length);
        System.out.println(multiTwo[2].length);
        System.out.println(multiTwo[0] [2]);
        System.out.println(multiTwo[1] [1]);











    }
}
