package day5_variables;

public class EmployeeInfo {
    public static void main(String[] args) {
        /*
    create a class EmployeeInfo
	create a main method
	declare and assign these variables:
		first name, last name, gender, age, company name, are the full time, job title, salary, number of pto (0-25), are they married, suite(char - A, B, C, D)

	Print all the variables
     */

        String firstName = "Eliza";
        String lastName = "Turgunbaeva";
        char gender = 'F';
        String companyName = "Firdaus";
        boolean fullTime = true;
        String jobTitle = "CEO";
        int salary = 9000;
        int pto = 25;
        boolean married = true;
        char suite = 'A';

        System.out.println("My name is " + firstName +  " \nLast name " + lastName + " \nI am " + gender + " \nMy company name is " + companyName + " \nI work " + fullTime
       + " \nI am " + jobTitle + " \nIn a week I earn " + salary + " \nThe pto is " + pto + " \nI am already married " +married + " \nThe suite is " + suite );


        System.out.println("***********************************************");


        String aboutMyself =  "My name is " + firstName + "\nLast name " + lastName + "\nI am " + gender + "\nMy company name is " + companyName + "\nI work " + fullTime
                + "\nI am " + jobTitle + "\nIn a week I earn " + salary + "\nThe pto is " + pto + "\nI am already married " +married + "\nThe suite is " + suite;

        System.out.println(aboutMyself);


















    }
}
