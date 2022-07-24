package Replit_practicing;

public class employee2 {
    public static void main(String[] args) {

        String firstName = "Noah";
        String lastName = "Smith";
        String companyName = "Apple";
        int salary = 200_000;
        String startDay = "10";
        String startMonth = "1";
        String startYear = "2022";
        boolean isFullTime = true;
        String jobTitle = "SDET";
        String officeAdress = "One Apple Park Way, Cupertino, CA 95014";


        String fullName = firstName + " " + lastName;
        String fullStartDate = startMonth + "/" + startDay + "/" + startYear;
        String email = firstName + startDay + "@" + companyName + ".com";


        int salaryAfter2Years = salary + salary*15/100;
        System.out.println("Employee Information");

        System.out.println("We have " + fullName + " joining " + companyName + "\n"+ firstName + " will start on " + fullStartDate +
                " as full time: " + isFullTime + "\n" + firstName + " here is some information about your employment" + "\nYour email is " + email +
                "\nYour base salary is $" + salary + " and after 2 years it will be $" + salaryAfter2Years + "\nWelcome aboard, see you at " + officeAdress);
    }
}
