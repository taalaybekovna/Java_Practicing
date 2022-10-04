package day31_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {90, 87, 2023, 1, 46, 100};
        int [] notSorted = nums;
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));
        System.out.println(nums);

    }
}


