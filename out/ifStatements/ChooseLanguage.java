package Extra_Practicing.ifStatements;

import java.util.Scanner;

public class ChooseLanguage {
    /*
    ask the user to enter a number based on the language they wanted to use.
    1 - English
    2 - Spanish
    3 - Turkish
    4 - Russian
    5 - French

based on the number they picked print a message:

    1 : "hello, thank for your call"
    2 : "hola, gracias para llamar"
    3 : "merhaba, aradiginiz icin tesekkurler"
    4 : "privet, spasibo za vash zvonok"
    5 : "Merci ,pour votre appel"
    any other number: "We will use English by default"
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number you want to use: \n1.\tEnglish \n2.\tSpanish \n3.\tTurkish \n4.\tRussian \n5.\tFrench");
        int num = scan.nextInt();

        System.out.println("**********************************************************************************");

        if (num == 1){
            System.out.println("hello, thank for your call");
        } else if (num == 2) {
            System.out.println("hola, gracias para llamar");
        } else if (num == 3){
            System.out.println("merhaba, aradiginiz icin tesekkurler");
        } else if (num == 4){
            System.out.println("privet, spasibo za vash zvonok");
        } else if (num == 5){
            System.out.println("Merci ,pour votre appel");
        } else {
            System.out.println("incorrect number");
        }















    }
}
