package com.company.queue;

public interface Queue <T>{
    void add(T e);
    T pop() throws EmptyQueueException;
    void peek();

}
