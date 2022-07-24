package JavaCoding_questions;

public class Reverse {
    /*
    5️⃣ String - Reverse
Write a return method that can reverse String
Ex: Reverse("ABCD"); ==> DCBA
     */

    public static void main(String[] args) {
        System.out.println(reverse("ABCD"));
        System.out.println(reverse("Java is fun"));
    }

    public static String reverse(String str){
        String newStr = "";
        for (int i=str.length()-1; i >=0; i--) {
            newStr+= "" + str.charAt(i);
            
        }
        return newStr;




    }
}
