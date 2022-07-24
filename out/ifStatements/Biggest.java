package Extra_Practicing.ifStatements;

import java.util.Scanner;

public class Biggest {
    public static void main(String[] args) {
         /*

        declare and assign 3 int variables
        between the 3 numbers find the print the biggest one

     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
       int num1 = scan.nextInt();
       int num2 = scan.nextInt();
       int num3 = scan.nextInt();

       if (num1 > 10){
           System.out.println("The biggest number");
       }else if (num2 > 8){
           System.out.println("this is small number");
       }else if (num3 > 1){
           System.out.println("This is the smallest number");
       }










    }
}
