package day18_String;

import java.util.Scanner;

public class Filter {
    /*
     /*
    ask the user to enter a message
    clean the message for empty spaces in the beginning and end
    check the message for bad phrases:

        java is bad
        quit
        have fun
        crying

    if there is a bad phrase in the message print:

        message failed to send

    otherwise, print:

	$message sent
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a message");
        String msg = scan.nextLine();

        if (msg.contains("quit") || msg.contains("fun")|| msg.contains("bad")){
            System.out.println("message failed to send");
        } else
            System.out.println("\n* " + msg + " *" + " \nhas been sent");
        }
}


