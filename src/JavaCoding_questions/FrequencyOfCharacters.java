package JavaCoding_questions;

public class FrequencyOfCharacters {
    /*

            Hi @student , here are the Java Coding questions I mentioned . Please solve them by yourselves, and don't use ready method as possible as you can.
            In our next meeting, I will randomly choose one of you and you will tell me how to solve the problem first verbal and then you will share your screen and show me the code. 💻 💪

        1️⃣ String - Frequency of Characters
        Write a return method that can find the frequency of characters
        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

     */
    public static void main(String[] args) {
        System.out.println("frequencyOfChars(\"AAABBBCCCDEF\") = " + frequencyOfChars("AAABBBCCCDEF"));
    }
    public static String frequencyOfChars (String  FrequencyOfChars){
        //1️⃣ String - Frequency of Characters
        //        Write a return method that can find the frequency of characters
        //        Ex:  FrequencyOfChars("AAABBCDD") ==> A3B2C1D2

        // 1. declare instances

        String result = "";

        // 2. outer looping the variable for chars
        for (int i = 0; i < FrequencyOfChars.length(); i++) {
            int counter = 0;

            // 3. inner looping for frequency of ech char
            for (int j = 0; j < FrequencyOfChars.length(); j++) {
                // 4. if statement
                if (FrequencyOfChars.charAt(i) == FrequencyOfChars.charAt(j)) {
                    counter++;
                }
            }
            if (!(result.contains("" + FrequencyOfChars.charAt(i)))) {
                // 5. assign value to new variable
                result += "" + FrequencyOfChars.charAt(i) + counter;

            }
        }


        // 5. return the result
        return result;


    }

}
