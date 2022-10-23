package day49_inheritance.nokia;

public class Nokia {

    public String brand;
    private int price;

    public void sell(){
        System.out.println(brand + " is trending now");
    }

    public void trend(){
        System.out.println(price + " is fine for people");
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
