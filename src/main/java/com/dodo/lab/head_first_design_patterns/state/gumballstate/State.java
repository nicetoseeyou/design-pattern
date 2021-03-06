package com.dodo.lab.head_first_design_patterns.state.gumballstate;

public interface State {

    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();

    public void refill();
}
