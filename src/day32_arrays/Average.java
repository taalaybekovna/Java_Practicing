package day32_arrays;

import java.util.Arrays;

public class Average {

    /*

    Given a 2D array find the average of each inner array
    and extra: average of the whole array

    Ex:

        3, 4, 5, 6
        5, 2, 6
        10, 20, 30

     */
    public static void main(String[] args) {

        int [] [] average = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };

        System.out.println("Average 0: " + Arrays.toString(average[0]));
        System.out.println("Average 1: " + Arrays.toString(average[1]));
        System.out.println("Average 2: " + Arrays.toString(average[2]));
        System.out.println("Whole average: " + Arrays.deepToString(average));


        double total = 0;
        int totalLength = 0;

        for(int [] eachArray : average){

            //System.out.println(Arrays.toString(eachArray));

            double sum = 0;

            for(int eachNumber : eachArray){
                sum += eachNumber;
            }

            System.out.println(Arrays.toString(eachArray) + " the average is: " + (sum/ eachArray.length));
            total += sum;
            totalLength += eachArray.length;
        }

        System.out.println("Average of the whole 2D array: " + (total/totalLength));









    }
}
