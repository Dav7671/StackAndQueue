package com.company.queue;

public class EmptyQueueException extends RuntimeException{
    public EmptyQueueException(String message){
        super(message);
    }
}
