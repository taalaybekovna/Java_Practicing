package day33_methods;

public class Car {

    /*

    unlock the car
    open the door
    sit in the car
    close the door
    put on seatbelt
    start the engine
    put into drive and go

     */

    public static void UnlockCar(){
        System.out.println("Unlock the car");
    }

    public static void OpenCar(){
        System.out.println("Open the car");
    }

    public static void Sit(){
        System.out.println("Sit in the car");
    }

    public static void Close(){
        System.out.println("Close the car");
    }

    public static void PutOnSetBelt(){
        System.out.println("Put on seatbelt");
    }

    public static void Start(){
        System.out.println("Start the engine");
    }

    public static void Drive(){
        System.out.println("Drive and go");
    }

    public static void GoInHurry(){
        Start();
        Drive();
    }

    public static void main(String[] args) {
        UnlockCar();
        OpenCar();
        Sit();
        Close();
        PutOnSetBelt();
        Start();
        Drive();

        System.out.println("--------------------------------------------------------------");

        GoInHurry();
        System.out.println("Going in hurry");
    }


}
