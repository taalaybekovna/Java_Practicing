package Extra_Practicing.ifStatements.nested_if;

public class Amazon {
    /*
       Task:
           declare and assign a price variable
           declare and assign a boolean - hasPrime variable

           possible outputs:

               prime member:
                   Eligible for 2-day shipping

               not prime and item price is more than or equal 25:
                   Eligible for regular free shipping

               not prime and item price is less than 25:
                   Not eligible for free shipping. Shipping fee: 3.99

        */
    public static void main(String[] args) {


        boolean hasPrime = false;
        int price = 0;

        if (hasPrime) {
            System.out.println("Eligible for 2-day shipping");
        } else {

            if (price > 25) {
                System.out.println("Eligible for regular free shipping");
            } else {
                System.out.println("Not eligible for free shipping Shipping fee: 3.99.");

            }
        }
    }
}

