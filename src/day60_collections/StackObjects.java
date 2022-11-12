package day60_collections;

import java.util.Stack;

public class StackObjects {
    public static void main(String[] args) {

        Stack<Character> stack = new Stack<>();
        stack.push('a');
        stack.push('b');
        stack.push('c');
        stack.push('d');

        System.out.println(stack);
        System.out.println("--------------------------------------------");

        System.out.println(stack.pop()); // d - removes the element at the top of the stack and returns it
        System.out.println(stack);
        System.out.println(stack.peek()); // c - returns what at the top of your stack -> last element added
        System.out.println(stack);
        System.out.println(stack.empty()); // false
        System.out.println(stack);
        System.out.println(stack.remove(0)); // a
        System.out.println(stack);

    }
}

