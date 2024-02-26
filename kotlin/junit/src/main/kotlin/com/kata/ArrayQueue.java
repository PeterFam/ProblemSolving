package com.kata;

public class ArrayQueue {
    private int[] items;
    private int rear;
    private int count;
    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    public void enqueue(int item){
        if(count == items.length)
            throw new IllegalStateException();

        items[rear++] = item;
        count++;
    }

    public void dequeue(){}
}
