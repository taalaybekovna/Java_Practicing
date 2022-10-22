package day49_inheritance;

public class Person {

    /*

    Person is the Super class

        name, age, favorite hobby

        talk()

    Student class is the subclass of Person

        int fun Level

        study()

 */

    String name;
    int age;
    String hobby;

    public void talk(){
        System.out.println(name + " is talking");
    }


}
