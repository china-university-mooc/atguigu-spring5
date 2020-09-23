package com.itutry.spring5.demo1;

import java.util.Observable;

public class MyObservable extends Observable {

    @Override
    public synchronized void setChanged() {
        super.setChanged();
    }
}
