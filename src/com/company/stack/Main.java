package com.company.stack;

public class Main {
    public static void main(String[] args) {
        StackImpl<Integer> stack = new StackImpl<>();
        stack.push(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.print();
        System.out.println();
        stack.peek();
        System.out.println(stack.pop());

    }
}
