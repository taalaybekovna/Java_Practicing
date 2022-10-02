package day30_arrays;

import java.util.Arrays;

public class SplitExample {
    public static void main(String[] args) {

        String s = "monday,tuesday,wednesday,thursday,friday,saturday,sunday";
        String [] days = s.split(",");
        System.out.println(Arrays.toString(days));

        System.out.println("************************************************");

        // for each loop

        String words = "Muezza-cat-koshka-myshyk";
        String [] m = words.split("-");
        System.out.println(Arrays.toString(m));

        System.out.println("************************************************");

        String names = "Eliza/Jyrgal/Elnura/Upol/Tannur";
        String [] n = names.split("/");
        System.out.println(Arrays.toString(n));

        System.out.println("************************************************");

        String cities = "Nookat_Osh_Bishkek_Atamerek_Talas";
        String [] c = cities.split("_");
        System.out.println(Arrays.toString(c));

        System.out.println("************************************************");

        String phones = "Nokia5Sony5Motorolla5Samsung5MI";
        String [] p = phones.split("5");
        System.out.println(Arrays.toString(p));

        System.out.println("************************************************");

        String rooms = "Bed room0Kitchen0Living room0Bath room0Toilet0Hall";
        String [] r = rooms.split("0");
        System.out.println(Arrays.toString(r));

        System.out.println("************************************************");

        String family = "Husband>Wife>Daughter>Son";
        String [] f = family.split(">");
        System.out.println(Arrays.toString(f));


    }
}
