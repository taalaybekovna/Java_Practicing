package day28_arrays;

import java.util.Arrays;

public class ArrayIntro2 {
    public static void main(String[] args) {

        double[] arr = new double[3];

        System.out.println(Arrays.toString(arr));

        arr[0] = 5.1;
        arr[1] = 6.1;
        arr[2] = 7.1;

        System.out.println(Arrays.toString(arr));

        // reassigning

        arr[0] = 4.1;
        System.out.println(Arrays.toString(arr));

        arr = new double[4];
        arr[3] = 8.1;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[1]);


    }
}
