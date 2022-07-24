package Extra_Practicing.ifStatements.nested_if;

public class loginApp {
     /*
    inputs:
declare and assign a 4 digit pin code
declare and assign the last 4 digits of ssn: 1234

declare and assign expected values for both
	example expected:
		pin: 1552
		ssn: 1234

outputs:

	when the pincode and ssn match the expected print:
		Authentication successful

	when the pincode or ssn are not correct print:
		Authentication failed

	when the pincode was not correct print:
		incorrect pin code

	when the ssn is not correct print:
		invalid ssn
     */
     public static void main(String[] args) {

         int expectedPin = 1552;
         int expectedSsn = 1234;

         if (expectedPin == expectedSsn){
             System.out.println("Authentication successful");
             if (expectedPin < expectedSsn){
                 System.out.println("Authentication failed");
             } else  {
                 System.out.println("incorrect pin code");
             }
         } else {
             System.out.println("invalid ssn");
     }

     }
}
