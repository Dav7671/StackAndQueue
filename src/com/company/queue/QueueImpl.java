package com.company.queue;

import com.company.DynamicArray;

public class QueueImpl<T> implements Queue<T> {
    private DynamicArray<T> arr = new DynamicArray<>();
    private int size = 0;
    @Override
    public void add(T e) {
        arr.add(e);
        size++;
    }

    @Override
    public T pop() throws EmptyQueueException {
        if (size > 0) {
            size--;
            return arr.removeAt(0);
        } else throw new EmptyQueueException("The Queue is empty");
    }

    @Override
    public void peek() {
        System.out.println(arr.get(0));
    }

    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }

}
