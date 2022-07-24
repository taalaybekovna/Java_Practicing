package Extra_tasks.If_statement_practice;



public class TimeOfDay {
   /*
   create an int value for the time of the day. Use a 24-hour format
    use the given time of day to display a message
    hint: use separate if statements

	if the hours are from 6 to 11, print: Good morning
	if the hours are from 12 to 16, print: Good evening
	if the hours are from 17 to 23, print: Good night

    */
   public static void main(String[] args) {

       int time = 24;

       if (time > 9){
           System.out.println("Good morning");
       } else if (time > 12){
           System.out.println("Good evening");
       } else if (time > 23){
           System.out.println("Good night");
       } else {
           System.out.println("Invalid time of day");
       }








   }

}
