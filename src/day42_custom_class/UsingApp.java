package day42_custom_class;

public class UsingApp {
    public static void main(String[] args) {

        App phone = new App();

        phone.name = "Samsung";
        phone.version = 11.5;
        phone.cost = 900.100;


        phone.work();
        phone.model();
        phone.expensive();

        System.out.println(phone.name);
        System.out.println(phone.version);
        System.out.println(phone.cost);






    }
}
