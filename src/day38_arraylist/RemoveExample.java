package day38_arraylist;

import java.util.ArrayList;

public class RemoveExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Eliza");
        list.add("Jyrgal");
        list.add("Elnura");
        list.add("Upol");
        list.add("Tannur");
        list.add("dog");
        System.out.println(list);


        list.remove(5);
        System.out.println(list);

        System.out.println(list.remove(list.size() -1));





    }
}
