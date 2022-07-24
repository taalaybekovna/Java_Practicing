package Extra_Practicing.ifStatements;

public class Diving {
    /*
    create a class Diver

    You are diving in the ocean. Your oxygen tank has a certain level (number)

    declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

        Above 90 - Your tank is full
        Above 80 - Still okay
        Above 70 - Don't go too far
        Above 60 - Start to head back
        Above 50 - Be careful now you at 50%
     */

    public static void main(String[] args) {


        int oxygen = 40;


        if (oxygen > 90){
            System.out.println("Your tank is full");
        } else if (oxygen > 80){
            System.out.println("Still okay");
        } else if (oxygen > 70){
            System.out.println(" Don't go too far");
        } else if (oxygen > 60){
            System.out.println("Start to head back");
        } else if (oxygen > 50){
            System.out.println("Be careful now you at 50%");
        } else {
            System.out.println("Dangerous");
        }


        String  result;

        if (oxygen > 90){
            result = "Your tank is full";
        } else if (oxygen > 80){
            result = "Still okay";
        } else if (oxygen > 70){
            result = " Don't go too far";
        } else if (oxygen > 60){
            result = "Start to head back";
        } else if (oxygen > 50){
            result = "Be careful now you at 50%";
        } else {
            result = "Dangerous";
        }

        System.out.println(result);




    }
}
