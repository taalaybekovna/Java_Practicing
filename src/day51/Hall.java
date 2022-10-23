package day51;

public class Hall extends House {

    public Hall(int number){
        super("Hall", 2);
    }

    public void dust(){
        System.out.println(room + " was removed with duster");
    }


}
