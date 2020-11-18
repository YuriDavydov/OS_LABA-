package com.company;
public class Stack {
    Systemcall[] sc = new Systemcall[100];
    int num = 0;
    int Size;

    public Stack(int size) {
        this.Size = size;
    }

    public void push(int s, Object[] a) {
        if (num == Size) {
            System.out.println("Стек переполнен");
        } else {
            sc[num++] = new Systemcall(s, a);
        }
    }

    public Systemcall pop() {
        if (num != 0) {
            return sc[--num];
        }
        else{
            return null;
        }

    }
}
