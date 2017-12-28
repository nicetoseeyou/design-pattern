package com.dodo.lab.head_first_design_patterns.proxy.gumball;

import java.io.*;

public interface State extends Serializable {
    public void insertQuarter();

    public void ejectQuarter();

    public void turnCrank();

    public void dispense();
}
