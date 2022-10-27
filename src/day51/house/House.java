package day51.house;

public class House {
    String room;
    int number;

    public House(String room, int number) {
        this.room = room;
        this.number = number;
    }

    public void paint(){
        System.out.println(room + " looks good");
    }
}
