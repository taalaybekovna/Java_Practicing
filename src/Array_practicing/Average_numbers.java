package Array_practicing;

public class Average_numbers {
    public static void main(String[] args) {

        /*
                Even and odd from array
        Write a program that can count the even and odd number from an array of
        integers
        Ex:
        Input: [4,1,3,12,5]
        Output:
        Even: 2
        Odd: 3
         */
        int count1 = 0;
        int count2 = 0;

        int[] task = {4,1,3,12,5};
        for (int i = 0; i < task.length; i++) {
            if (task[i] % 2 == 0){
                count1 ++;
            } else {
                count2 ++;
            }
        }
        System.out.println(count1 + " even");
        System.out.println(count2 + " odd");
    }
}
