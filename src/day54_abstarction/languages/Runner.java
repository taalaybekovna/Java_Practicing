package day54_abstarction.languages;

public class Runner {
    public static void main(String[] args) {

        Kyrgyz kyrgyz = new Kyrgyz();
        kyrgyz.hi();
        kyrgyz.bye();

        System.out.println("----------------------------------------");

        Russian russian = new Russian();
        russian.hi();
        russian.bye();


        System.out.println("----------------------------------------");

        Uzbek uzbek = new Uzbek();
        uzbek.hi();
        uzbek.bye();









    }
}
