package day33_methods;

public class GetCharacters {
     /*

        make a method that prints all the letters from A - Z

        make a method that prints all the letters from a - z

        make a method that prints all the letters from Z - A

        make a method that prints all the letters from z - a

        make a method that prints all the numbers from 0 to 9

     */

    public static void Letters(){

        for(char i = 'A'; i <= 'Z'; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n----------------------------------------");
    }

    public static void SmallLetters(){
        for (char i = 'a'; i <= 'z'; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n----------------------------------------");
    }

    public static void Letters2(){
        for (char i = 'Z'; i >= 'A'; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n----------------------------------------");
    }

    public static void SmallLetters2(){
        for (char i = 'z'; i >= 'a'; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n----------------------------------------");
    }

    public static void Numbers(){
        for (int i = 0; i <= 9; i++){
            System.out.print(i + " ");
        }
        System.out.println("\n--------------------------------------------------");

    }

}
