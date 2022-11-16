package day65_streams;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class Recap {
    public static void main(String[] args) {
        /*

        1.1 Create a function that can check if two array are equal and contains the same elements
                ex: arr1 = {3,2,1}
                    arr2 = {2,1,3}

                output: true

 */

        BiPredicate<int [], int []> arrayIsEqual = (arr1, arr2) -> {

            Arrays.sort(arr1);
            Arrays.sort(arr2);

            return Arrays.equals(arr1, arr2);

        };

        int[] arr1 = {4, 5, 6};
        int[] arr2 = {6, 5, 7};

        System.out.println(arrayIsEqual.test(arr1, arr2));  // false
        System.out.println(Arrays.toString(arr1)); // [4, 5, 6]
        System.out.println(Arrays.toString(arr2)); // [5, 6, 7]





















    }
}
