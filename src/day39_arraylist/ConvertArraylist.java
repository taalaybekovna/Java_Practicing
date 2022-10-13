package day39_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArraylist {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.println(nums);

        System.out.println("-------------------------------------------------------");

        Integer [] num = {60, 70, 80, 90, 100};
        Arrays.asList(num);
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(num));
        System.out.println(nums);










    }
}
