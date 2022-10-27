package day54_abstarction.interface_ex;

public class Motorola implements Samsung {

 //  Samsung samsung = new Samsung();


    @Override
    public void call() {
        System.out.println("Calling");

    }

    @Override
    public void text() {

        System.out.println("Texting");

    }
}

