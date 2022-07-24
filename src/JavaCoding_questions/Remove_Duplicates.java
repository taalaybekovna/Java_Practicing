package JavaCoding_questions;

public class Remove_Duplicates {
    public static void main(String[] args) {
        /*
        3️⃣ String - Remove Duplicates
Write a return method that can remove the duplicated values from String
Ex:  removeDup("AAABBBCCC") ==> ABC
         */

        System.out.println(removeDuplicates("AAABBBCCC"));
    }
    public static String removeDuplicates (String str){
        String afterRemove="";

        for (int i = 0; i < str.length(); i++) {
            if (afterRemove.contains(""+str.charAt(i))){
                continue;
            }else {
                afterRemove+=str.charAt(i);
            }
            
        }
        return afterRemove;
    }
}
