package day28_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {
  /*
        all String types
        0 -> id
        1 -> first name
        2 -> last name
        3 -> batch number

     */
  public static void main(String[] args) {

      String [] student1 = {"8", "Eliza", "Turgunbaeva", "26"};
      System.out.println(Arrays.toString(student1));

      String [] student2 = new String[4];
      System.out.println(Arrays.toString(student2));
      student2[0] = "29";
      student2[1] = "Bagdat";
      student2[2] = "Abdyrakhmanov";
      student2[3] = "13";
      System.out.println(Arrays.toString(student2));

      String [] student3 = new String[4];
      System.out.println(Arrays.toString(student3));
      student3[0] = "87";
      student3[1] = "Daria";
      student3[2] = "Abulgazieva";
      student3[3] = "26";
      System.out.println(Arrays.toString(student3));










  }
}
