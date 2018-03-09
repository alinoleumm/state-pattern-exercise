package com.example.examplestatemachine;

public class RejectState extends State {

    public RejectState(StateContext sc) {
        this.sc = sc;
        this.accept = false;
    }

    public void actionA() {
        if (sc.getFirstAction()==null) {
            sc.setFirstAction("A");
            sc.setCurrentState(sc.getAcceptState());
        } else {
            if (sc.getFirstAction().equals("A")) {
                sc.setCurrentState(sc.getAcceptState());
            } else {
                sc.setCurrentState(sc.getRejectState());
            }
        }
    }

    public void actionB() {
        if (sc.getFirstAction()==null) {
            sc.setFirstAction("B");
            sc.setCurrentState(sc.getAcceptState());
        } else {
            if (sc.getFirstAction().equals("B")) {
                sc.setCurrentState(sc.getAcceptState());
            } else {
                sc.setCurrentState(sc.getRejectState());
            }
        }
    }

}
