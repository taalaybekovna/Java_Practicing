package day32_arrays;

import java.util.Arrays;

public class Family {
    public static void main(String[] args) {

        String [] [] families = new String[5][5];

        String [] familyOne = {"Bagdat", "Eliza", "Muezza"};
        families[0] = familyOne;

        System.out.println(Arrays.deepToString(families));

        String[] familyTwo = {"Jyrgal", "Guliza", "Adina", "Jasmin"};
        families[1] = familyTwo;
        System.out.println(Arrays.deepToString(familyTwo));


        String [] family3 = {"Abdurahman", "Elnura", "Ramazan"};
        families[2] = family3;
        System.out.println(Arrays.deepToString(families));

        String [] family4 = {"Beksultan", "Upol", "Ailin", "Ali"};
        families[3] = family4;
        System.out.println(Arrays.deepToString(families));

        String [] family5 = {"Maksat", "Aijamal", "Saphia", "Aru"};
        families[4] = family5;
        System.out.println(Arrays.deepToString(families));

        System.out.println("Family one: " + Arrays.toString(families[0]));
        System.out.println("Family two: " + Arrays.toString(families[1]));
        System.out.println("Family three: " + Arrays.toString(families[2]));
        System.out.println("Family four: " + Arrays.toString(families[3]));
        System.out.println("Family five: " + Arrays.toString(families[4]));









    }
}
