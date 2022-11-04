package com.company.stack;

public interface Stack <T>{
    void peek();
    T pop() throws EmptyStackException;
    void push(T item);
}
