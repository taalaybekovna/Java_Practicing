package day30_arrays;

public class CharArray {
    public static void main(String[] args) {

        char [] letters = {'B', 'a', 'g', 'd', 'a', 't'};
        System.out.println(letters);

        String name = "Eliza";
        System.out.println(name);

        System.out.println("--------------------------");

        String name2 = new String(letters);
        System.out.println(name2);
        System.out.println(name2.toUpperCase());

        char [] letters2 = name.toCharArray();
        System.out.println(letters2);

        // seems it's time to update


    }
}
