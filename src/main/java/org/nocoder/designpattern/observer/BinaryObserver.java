package org.nocoder.designpattern.observer;

public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println(this.getClass().getName() + ": " + Integer.toBinaryString(subject.getState()));
    }
}
