package day42_custom_class;

public class UsingCoffee {
    public static void main(String[] args) {

        Coffee mac = new Coffee();
        mac.price = 13.50;
        mac.size = 100.200;
        mac.brand = "MacCoffee";
        mac.type = "black";


        mac.cost();
        mac.amount();
        mac.name();
        mac.maccoffee();

        System.out.println(mac.price);
        System.out.println(mac.size);
        System.out.println(mac.brand);
        System.out.println(mac.type);















    }
}
