public class CreditScore {

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
