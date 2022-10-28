package day54_abstarction.languages;

public class Kyrgyz implements Language{

    @Override
    public void hi() {
        System.out.println("Salam");
    }

    @Override
    public void bye() {
        System.out.println("Kosh");

    }
}
