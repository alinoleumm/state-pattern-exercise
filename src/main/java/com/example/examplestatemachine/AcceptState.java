package com.example.examplestatemachine;

public class AcceptState extends State {

    public AcceptState(StateContext sc) {
        this.sc = sc;
        this.accept = true;
    }

    public void actionA() {
        if (sc.getFirstAction().equals("A")) {
            sc.setCurrentState(sc.getAcceptState());
        } else {
            sc.setCurrentState(sc.getRejectState());
        }
    }

    public void actionB() {
        if (sc.getFirstAction().equals("B")) {
            sc.setCurrentState(sc.getAcceptState());
        } else {
            sc.setCurrentState(sc.getRejectState());
        }
    }

}
