package day43_custom_classes;

import day42_custom_class.Phone;

public class PhoneTwo {

    /*

        create instance variables

            name, brand, memory, version

        create constructors

        - accept and initialize the name

        - accept and initialize the name and brand

        - accept and initialize the name, brand, memory, and version

        create a toString
     */


    String name;
    String brand;
    double memory;
    double version;



    @Override
    public String toString() {
        return "PhoneTwo{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", memory=" + memory +
                ", version=" + version +
                '}';
    }

    public PhoneTwo(String name) {
        this.name = name;
    }

    public PhoneTwo(String name, String brand) {
        this.name = name;
        this.brand = brand;
    }

    public PhoneTwo (String name, String brand, double memory, double version){

        this.name = name;
        this.brand = brand;
        this.memory = memory;
        this.version = version;




    }












}
