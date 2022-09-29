package day26_nested_loop;

public class MultiplicationTable {
    /*

       print the multiplication by the numbers from 1 to 10
       we will see for all numbers 1 - 10

       1 x 1 = 1
       1 x 2 = 2
       ...
       2 x 1
       2 x 2
       ..
       3 x 1
       ..

       10 x 10

    */
    public static void main(String[] args) {


        for (int i = 1; i < 10; i++) {
            System.out.println(1 + " x " + i + " = " + 1 * i);

        }

        System.out.println("------------------------------------------");

        for (int j = 1; j < 10; j++) {
            System.out.println(2 + " x " + j + " = " + j * 2);
        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.println(3 + " x " + i + " = " + 3 * i);

        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.println(4 + " x " + i + " = " + 4 * i);

        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.println(5 + " x " + i + " = " + 5 * i);

        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.println(6 + " x " + i + " = " + 6 * i);

        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.println(7 + " x " + i + " = " + 7 * i);

        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.println(8 + " x " + i + " = " + 8 * i);

        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.println(9 + " x " + i + " = " + 9 * i);

        }

        System.out.println("---------------------------------------------");

        for (int i = 1; i < 10; i++) {
            System.out.println(10 + " x " + i + " = " + 10 * i);

        }

        // nested loop, and it's Saim's (I copied)

        for (int num = 1; num <= 10; num++) {

            for (int multi = 1; multi <= 15; multi++) {

                System.out.print(num + " x " + multi + " = " + (num * multi) + " | ");

            } // end of the inner loop

            System.out.println();
        }
    }
}
