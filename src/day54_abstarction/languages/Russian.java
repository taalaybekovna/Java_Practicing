package day54_abstarction.languages;

public class Russian implements Language{

    @Override
    public void hi() {
        System.out.println("Privet");
    }

    @Override
    public void bye() {
        System.out.println("Poka");

    }
}
