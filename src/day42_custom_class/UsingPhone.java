package day42_custom_class;

public class UsingPhone {
    public static void main(String[] args) {

        Phone phone = new Phone(true, false,true);

        phone.name = "Samsung";
        phone.price = 900.50;
        phone.color = "Grey";


        System.out.println(phone);




    }
}
