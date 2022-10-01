package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class FriendsList {
    public static void main(String[] args) {
        /*

        Make an array of your friends names

        asking how many friends do you have

        then ask for each friend's name one at a time, store all the names into an array

        at the end print your friend list
     */

        Scanner input = new Scanner(System.in);
        System.out.println("How many friends do you have? ");
        int size = input.nextInt();
        String [] friendList = new String[size];

        for(int i = 0; i < friendList.length; i++){

            System.out.println("Enter the name of friend " + (i + 1) );
            friendList[i] = input.next();

        }

        System.out.println(Arrays.toString(friendList));


    }
}
