package day33_methods;

public class MyFirstMethod {


    public static void HelloWorld(){


        /**
         *  public is -> access modifier
         *  static is -> static modifier
         *  void is -> return type
         *  HelloWorld is -> method name
         *  () -> parenthesis
         */

        System.out.println("Hello World 1");
    }

    public static void HelloWorld5(){
        for (int i = 0; i < 3; i++){
            System.out.println("Hello world 2");
        }
    }

    public static void main(String[] args) {
        HelloWorld();
        HelloWorld5();

    }
}
