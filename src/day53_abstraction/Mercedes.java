package day53_abstraction;

public class Mercedes extends BMW{


    @Override
    public void charge() {
        System.out.println("You can charge your car here");
    }

    @Override
    public void drive() {
        System.out.println("Drive your car very fast");

    }
}
