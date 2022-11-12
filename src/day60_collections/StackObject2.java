package day60_collections;

import java.util.Stack;

public class StackObject2 {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack);

        System.out.println(stack.pop()); //50
        System.out.println(stack);
        System.out.println(stack.empty()); // false
        System.out.println(stack.peek()); // 40
        System.out.println(stack.remove(0));
        System.out.println(stack);









    }
}
