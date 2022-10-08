package day34_methods;

public class VoidVsReturn {

    public static void Hello(){
        System.out.println("Hello my love");
    }

    public static String Bye(){
        return "Bye my bad thoughts";
    }


    public static void main(String[] args) {

        Hello();
        Bye(); // this doesn't work
        System.out.println(Bye());  // first variant
        String msg = Bye();       // second variant
        System.out.println(msg);






    }
}
