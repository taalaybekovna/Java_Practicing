package day39_arraylist;

import java.util.ArrayList;

public class Class {
    public static void main(String[] args) {

        ArrayList<String> family = new ArrayList<>();
        System.out.println(family);

        family.add("Bagdat");
        family.add("Eliza");
        family.add("Muezza");
        System.out.println(family);
        System.out.println("---------------------------------------------------------------------------");


        System.out.println(family.size());
        System.out.println("------------------------------------------------------------------------------");

        System.out.println("The king of this family is " + family.get(0));
        System.out.println("The queen of this family is " + family.get(1));
        System.out.println("The pet of this family is " + family.get(2));

        System.out.println("---------------------------------------------------------------------------------");

        for (int i = 0; i < family.size(); i++){
            System.out.println("Member " + (i + 1) + " " + family.get(i));
        }

        System.out.println("------------------------------------------------------------------------------");

        for (String member : family){
            System.out.println("Member: " + member);
        }







    }
}
