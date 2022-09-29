package day26_nested_loop;

public class Month {
     /*
            Go through a whole month, by doing through each week and each day
         */

    public static void main(String[] args) {

        for (int October = 0; October < 1; October++) {
            System.out.println("In October I will work 4 weeks :");

            for (int week = 1; week <5; week++) {

                System.out.println("\tWeek: " + week);

                for (int day = 0; day < 1; day++) {
                    System.out.println("\t\t40 hours");

                    for (int happySixHour = 0; happySixHour < 1; happySixHour++) {
                        System.out.println("\t\t\tLovely hour");

                    }

                }
               }



            }

        }


    }

