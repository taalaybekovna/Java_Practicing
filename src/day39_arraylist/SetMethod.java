package day39_arraylist;

import java.util.ArrayList;

public class SetMethod {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        System.out.println(nums);

        System.out.println("------------------------------------");

        nums.set(0, 50);
        nums.set(1, 60);
        nums.set(2, 70);
        nums.set(3, 80);
        System.out.println(nums);

        System.out.println("---------------------------------");

        nums.add(50);
        nums.add(60);
        nums.indexOf(50);
        nums.lastIndexOf(60);

        System.out.println(nums);












    }
}
