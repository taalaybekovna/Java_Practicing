package day42_custom_class;

public class AllPeople {
    public static void main(String[] args) {


        Person one = new Person();
        Person two = new Person();

        one.name = "Bagdat";
        one.age = 34;
        one.weight = 80.5;
        one.height = 1.85;
        one.isMarried = true;

        System.out.println("Name is: " + one.name);
        System.out.println("Age is: " + one.age);
        System.out.println("Weight is: " + one.weight);
        System.out.println("Height is: " + one.height);
        System.out.println("Married: " + one.isMarried);

        System.out.println("----------------------------------------------");

        two.name = "Eliza";
        two.age = 32;
        two.weight = 55.2;
        two.height = 1.61;
        two.isMarried = true;

        System.out.println("Name is: " + two.name);
        System.out.println("age is: " + two.age);
        System.out.println("Weight is: " + two.weight);
        System.out.println("Height is: " + two.height);
        System.out.println("Married: " + two.isMarried);
    }
}
