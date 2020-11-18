package com.company;
public class Systemcall
{
    int identificator ;
    Object[]args;
    public Systemcall(int a,Object[]ar){
        this.identificator = a;
        this.args=new Object[ar.length];
        for(int i =0;i< ar.length;i++){
            this.args[i]=ar[i];
        }
    }
    public void Systemcall0(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof Integer && args[1]instanceof Integer)
        {
            System.out.println("Вызывается системный вызов 0");
        }
        else
        {
            System.out.println("Системмный взыв 0:неверно указан аргумент");
        }
    }
    public void Systemcall1(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof Double && args[1]instanceof Double)
        {
            System.out.println("Вызывается системный вызов 1");
        }
        else
        {
            System.out.println("Системмный взыв 1:неверно указан аргумент");
        }
    }
    public void Systemcall2(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof String && args[1]instanceof String)
        {
            System.out.println("Вызывается системный вызов 2");
        }
        else
        {
            System.out.println("Системмный взыв 2:неверно указан аргумент");
        }
    }
    public void Systemcall3(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof Integer && args[1]instanceof String)
        {
            System.out.println("Вызывается системный вызов 3");
        }
        else
        {
            System.out.println("Системмный взыв 3:неверно указан аргумент");
        }
    }
    public void Systemcall4(Object[]args)
    {
        if(args.length == 2 && args[0]instanceof Double && args[1]instanceof String)
        {
            System.out.println("Вызывается системный вызов 4");
        }
        else
        {
            System.out.println("Системмный взыв 4:неверно указан аргумент");
        }
    }
}
