package day51.house;

public class Kitchen extends House{

    public Kitchen(int number){
        super("Kitchen", 3);
    }

    public void clean(){
        System.out.println(room + " is deep cleaning");
    }

}
