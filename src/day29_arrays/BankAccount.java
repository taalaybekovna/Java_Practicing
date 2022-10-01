package day29_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class BankAccount {
    public static void main(String[] args) {

         /*
        0 - full name
        1 - account type
        2 - account number
        3 - balance
     */

        // First account

        String [] bankAccountOne = {"Eliza Turgunbaeva", "Checking" , "100219482", "100,000,000"};
        System.out.println("Number of elements in the array " + bankAccountOne.length);
        System.out.println("Whole Array " + Arrays.toString(bankAccountOne));
        System.out.println("Name: " + bankAccountOne[0]);
        System.out.println("Account type: " + bankAccountOne[1]);
        System.out.println("Account number: " + bankAccountOne[2]);
        System.out.println("Balance " + bankAccountOne[3]);

        System.out.println("-------------------------------------------------------");
        // Second account

        String [] bankAccountTwo = new String[4];
        System.out.println(Arrays.toString(bankAccountTwo));
        bankAccountTwo[0] = "Bagdat";
        bankAccountTwo[1] = "Abdyrakhmanov";
        bankAccountTwo[2] = "123456789";
        bankAccountTwo[3] = "123,456,789,1234";

        System.out.println(Arrays.toString(bankAccountTwo));

        System.out.println("----------------------------------------------------");
        // Third account

        String [] bankAccountThree = new String[4];
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        bankAccountThree[0] = fullName;
        System.out.println("Please enter your  account type");
        bankAccountThree[1] = input.nextLine();
        System.out.println("Please enter your account number ");
        bankAccountThree[2] = input.nextLine();
        System.out.println("Please enter your balance");
        bankAccountThree[3] = input.nextLine();

        System.out.println(Arrays.toString(bankAccountThree));

        System.out.println("-----------------------------------------------");
        //Account four

        String [] bankAccountFour = new String[4];
        String [] question = {"Full name", "Account type", "Account number", "Balance"};

        for (int i = 0; i < bankAccountFour.length; i++){
            System.out.println("Enter your question: " + question[i]);
            bankAccountFour[i] = input.nextLine();

        }

        System.out.println(Arrays.toString(bankAccountFour));



    }
}
