package day42_custom_class;

public class App {

    String name;
    double version;
    double cost;

    public void work(){
        System.out.println(name + " is good");
    }

    public void model(){
        System.out.println(version + " this version is cool");
    }

    public void expensive(){
        System.out.println("$ " + cost + " this is very cheap");
    }
}
