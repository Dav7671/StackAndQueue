package com.company.queue;

public class Main {
    public static void main(String[] args) {

        QueueImpl<Integer> queue = new QueueImpl<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.print();
        System.out.println();
        System.out.println(queue.pop());
        queue.peek();
        queue.pop();
        queue.pop();
        queue.pop();
        queue.pop();
    }
}
