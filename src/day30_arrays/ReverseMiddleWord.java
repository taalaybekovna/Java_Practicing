package day30_arrays;

public class ReverseMiddleWord {
    public static void main(String[] args) {
         /*
            Have a sentence with 3 words
            reverse the middle word

            ex:
                java always fun

                output:
                    java syawla fun
         */

        String sentence = "I will work soon";
        String [] r = sentence.split(" ");
        String reverse = "";
        char [] middleWord = r[1].toCharArray();


        for(int i = middleWord.length -1; i >= 0; i--){
            reverse += middleWord[i];
        }
        System.out.println(r[0] + " " + reverse + " " + r[2]);


       /*
         String str = "java selenium fun";
        String [] words = str.split(" ");

        String reverse = "";
        char [] middleWord = words[1].toCharArray();

        for(int i = middleWord.length - 1; i >= 0; i--){
            reverse += middleWord[i];
        }

        System.out.println(words[0] + " " + reverse + " " + words[2]);

    }
        */
    }
}
