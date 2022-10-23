package day49_inheritance.nokia;

public class UsingNokia {

    public static void main(String[] args) {

        Nokia nokia = new Nokia();
        nokia.brand = "A One";
        System.out.println(nokia.brand);
        nokia.sell();

        Nokia nokia1 = new Nokia();
        nokia1.setPrice(800);
        nokia1.trend();


    }






}
