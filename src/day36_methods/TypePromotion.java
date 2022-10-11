package day36_methods;

public class TypePromotion {

    public static void Use(float f){
        System.out.println("Calling float type");
    }

    public static void Use(long l){
        System.out.println("Calling long type");
    }

    public static void Use(double d){
        System.out.println("Calling double type");
    }


    public static void main(String[] args) {

        Use(6);
        Use(5.5);
        Use(5.5f);
        Use(6l);
    }









}
