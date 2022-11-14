package day63_functional_interface;

public class UsingNumberInterface {

    public static void main(String[] args) {

        NumberInterface evenOrOdd = (n)-> {
            if (n % 2 == 0) {
                System.out.println(n + " is even");
            } else {
                System.out.println(n + " is odd");
            }

        };

        evenOrOdd.apply(3);
        evenOrOdd.apply(5);
        evenOrOdd.apply(40);

        NumberInterface cube = (number) -> {
            System.out.println(number * number * number);
        };

        cube.apply(1);
        cube.apply(20);
    }


}
