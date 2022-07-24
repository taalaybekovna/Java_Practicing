package JavaCoding_questions;

public class Same_letters {
    /*
        2️⃣ String - Same letters
    Write a return method that check if a string is build out of the same letters as another string.
    Ex:  same("abc",  "cab"); -> true
    same("abc",  "abb"); -> false:
         */
    public static void main(String[] args) {

        System.out.println(isSame("abc", "cab"));
        System.out.println(isSame("abc", "abb"));

    }
    public static boolean isSame(String str1, String str2){

        for (int i = 0; i < str1.length(); i++) {
            char letter=str1.charAt(i);

            if (!str2.contains(""+ letter)){
                return false;
            }
        }
        return true;
    }
}
