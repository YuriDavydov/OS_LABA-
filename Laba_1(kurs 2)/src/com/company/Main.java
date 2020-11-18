package com.company;

public class Main {

    public static void main(String[] args)
    {
        Core systemCore = new Core();
        Stack stack = new Stack(5);
        systemCore.printcalls();
        stack.push(0,new Object[]{5,5});
        stack.push(1,new Object[]{5.5,5.4});
        stack.push(2,new Object[]{"привет","как ты?"});
        stack.push(3,new Object[]{5,"нормально"});
       stack.push(3,new Object[]{5.5,"я тоже"});
        systemCore.Call(stack.pop());
        systemCore.Call(stack.pop());
        systemCore.Call(stack.pop());
        systemCore.Call(stack.pop());
        systemCore.Call(stack.pop());


    }
}
