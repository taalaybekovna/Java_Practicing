package day49_inheritance.person;

public class Student extends Person{
    /*
    Student class is the subclass of Person

        int fun Level

        study()

     */

    int level;

    public void study(){
        System.out.println(name + " is studying");
    }
}
