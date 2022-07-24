package Extra_Practicing.ifStatements;

public class BankAccount {
      /*
    Task: Hard code -> Dynamic

    Create a double value for the account balance. // 100
    Create a double value for how much you want to withdraw // 500

    Check the balance after the withdrawal
        if you tried to withdraw more money that you had in the account add a negative overdraft fee to the balance: -100

    In both cases print the remaining balance after withdrawing, with overdraft free applied if you went over

     */
      public static void main(String[] args) {

          double accountBalance = 100; // hard coded
          double howMuch = 500;  // hard coded

          if (howMuch % accountBalance == 0){
              System.out.println("free applied if you went over");
          } else {
              System.out.println("fee to the balance: -100");
          }























      }
}
