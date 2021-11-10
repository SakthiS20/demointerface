package com.company;

interface phone{
    void call();
    default void message(){
        System.out.println("Interface message");
    }
    static void write(){
        System.out.println("In interface !!");
    }
}
class AndroidPhone implements phone{
    public void call(){
        System.out.println("Calling");
    }
}

public class Main {

    public static void main(String[] args) {
        AndroidPhone androidPhone = new AndroidPhone();
        androidPhone.call();
        androidPhone.message();
        phone.write();

    }
}
