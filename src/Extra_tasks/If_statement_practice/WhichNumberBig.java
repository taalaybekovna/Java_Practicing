package Extra_tasks.If_statement_practice;

import java.util.Scanner;

public class WhichNumberBig {
    /*
    Create two number variables
Find and print which number is bigger between the two

	ex:
		50
		45

		output:
		50 is bigger
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        if (num1 >= num2){
            System.out.println(num1 + " is bigger");
        } else if (num2 >= num1){
            System.out.println(num2 + " is bigger");
        }else {
            System.out.println("invalid number");
        }






    }
}
