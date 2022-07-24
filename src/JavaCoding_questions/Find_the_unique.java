package JavaCoding_questions;

public class Find_the_unique {
    /*
    4️⃣ String - Find the unique
Write a return method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF") ==> "DEF";
     */
    public static void main(String[] args) {
        System.out.println(uniqueChars("AAABBBCCCDEF"));
    }
    public static String uniqueChars(String str){

        String unique = "";

        for (int i = 0; i < str.length(); i++) {
            char outerLetters = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                char innerLetters = str.charAt(j);
                if (outerLetters == innerLetters){
                    count++;
                }
            }
            if (count == 1){
                unique += outerLetters;
            }
            
        }
        return unique;

    }
}
