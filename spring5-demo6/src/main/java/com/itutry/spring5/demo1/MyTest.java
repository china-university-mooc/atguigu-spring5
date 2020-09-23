package com.itutry.spring5.demo1;

public class MyTest {

    public static void main(String[] args) {
        MyObservable observable = new MyObservable();

        observable.addObserver((o, arg) -> {
            System.out.println("发生变化");
        });
        observable.addObserver((o, arg) -> {
            System.out.println("被通知，准备改变");
        });

        observable.setChanged();
        observable.notifyObservers();
    }
}
