package com.company.stack;

import com.company.DynamicArray;

public class StackImpl<T> implements Stack<T> {
    private DynamicArray<T> arr = new DynamicArray<>();
    private int size = 0;

    @Override
    public void peek() {
        System.out.println(arr.get(size - 1));
    }

    @Override
    public T pop() throws EmptyStackException {
        int index = size - 1;
        if (size > 0) {
            size--;
            return arr.removeAt(index);
        } else throw new EmptyStackException("The stack is empty");
    }

    @Override
    public void push(T item) {
        arr.add(item);
        size++;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr.get(i) + " ");
        }
    }
}
