package day55_polimorphysm;

public class Running {
    public static void main(String[] args) {

       Tractor tractor = new Tractor();
       tractor.drive();
       tractor.name = "Tractor";
       tractor.black = "black";
        System.out.println(tractor.name);
        System.out.println(tractor.black);

        System.out.println("------------------------------------------------------");


        Tiko tiko = new Tiko();
        tiko.drive();
        tiko.name = "Tiko 500";
        tiko.black = "Is blue";
        tiko.blue = "Blue";
        System.out.println(tiko.name);
        System.out.println(tiko.black);
        System.out.println(tiko.blue);


        System.out.println("------------------------------------------------------");


        Car car = new Car();
        car.drive();
        car.name = "Hammer";
        System.out.println(car.name);








    }
}
