package day42_custom_class;

public class Coffee {
    /*

    Create a coffee class with these instance variables:
         price, size(oz), brand, types

         ex types: black, cappuccino, latte, mocchiato....

    instance methods:

        - make a toString to print all the information of the coffee objects

        - drink(): print: drinking $type of coffee

        - refill(amount in oz): print refilling x oz
            add the number of oz to the total size

     */

    double price;
    double size;
    String brand;
    String type;

    public void cost(){
        System.out.println(price + " som is good for Osh");
    }

    public void amount(){
        System.out.println(size + " is big");
    }

    public void name(){
        System.out.println(brand + " is my favorite coffee");
    }

    public void maccoffee(){
        System.out.println(type + ", milk, sugar mixed");
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "price=" + price +
                ", size=" + size +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
