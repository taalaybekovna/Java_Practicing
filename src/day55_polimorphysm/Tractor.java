package day55_polimorphysm;

public class Tractor extends Car{

    String black;

    @Override
    public void drive() {
        System.out.println("Tractor is driving");
    }
}
