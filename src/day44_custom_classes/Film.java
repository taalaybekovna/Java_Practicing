package day44_custom_classes;

public class Film {


    String name;
    double length;
    String genre;

    public Film(String name) {
        this.name = name;
    }

    public Film(String name, double length) {
        this(name);
        this.length = length;
    }

    public Film(String name, double length, String genre) {
//        this.name = name;
//        this.length = length;
        this(name,length);
        this.genre = genre;
    }


    @Override
    public String toString() {
        return "Film{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", genre='" + genre + '\'' +
                '}';
    }
}
