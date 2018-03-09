package com.example.examplestatemachine;

public class StateContext {

    private State acceptState;
    private State rejectState;
    private State currentState;
    private String firstAction;

    public StateContext() {
        this.acceptState = new AcceptState(this);
        this.rejectState = new RejectState(this);
        currentState = rejectState;
    }

    public void actionA() {
        currentState.actionA();
    }

    public void actionB() {
        currentState.actionB();
    }

    public boolean isAccept() {
        return currentState.isAccept();
    }

    public void setFirstAction(String firstAction) {
        this.firstAction = firstAction;
    }

    public String getFirstAction() {
        return firstAction;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public State getAcceptState() {
        return acceptState;
    }

    public State getRejectState() {
        return rejectState;
    }

}
