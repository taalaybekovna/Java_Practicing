package day36_methods;

public class Painter {

    public static void main(String[] args) {

        Picture.paint();
        Picture.paint("green");
        Picture.paint(3);

        String a = "600";
        Picture.paint(a);

    }


    public static class CreditScore {

        public static int GetCreditScore(){
            return 1000;
        }

        public static void main(String[] args) {

            int num = GetCreditScore();
            System.out.println(num);

            System.out.println(GetCreditScore());

            System.out.println(GetCreditScore() + 500);

        }









    }
}
