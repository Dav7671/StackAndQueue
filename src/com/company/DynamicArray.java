package com.company;

import java.util.Arrays;

public class DynamicArray <T>{
    private Object[] array = new Object[6];
    private int currentSize = 0;

    public void add(T element) {
        if (currentSize == array.length) {
            scaleArray();
        }
        array[currentSize] = element;
        currentSize++;
    }

    private void scaleArray() {
        Object[] tmpArray = new Object[array.length * 2];
        for (int i = 0; i < array.length; i++) {
            tmpArray[i] = array[i];
        }
        array = tmpArray;
    }

    public T removeAt(int index){
        if(index > currentSize){
            throw new ArrayIndexOutOfBoundsException("Hajox Valodik");
        }
        T value = (T) array[index];
        Object[] tempArray = new Object[currentSize - 1];
        int count = 0;
        for (int i = 0; i < currentSize ; i++) {
            if(i!= index){
                tempArray[count++] = array[i];
            }
        }
        currentSize -= 1;
        array = tempArray;
        return value;
    }

    public void remove(T value){
        Object[] tempArray = new Object[array.length];
        int index = 0;
        for (int i = 0; i < currentSize; i++) {
            if(array[i] != value){
                tempArray[index] = array[i];
                index++;
            }
        }
        currentSize = index;
        array = tempArray;
    }

    public T get(int index){
        return (T) array[index];
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < currentSize; i++) {
            string += array[i] + " ";
        }
        return string;
    }
}
