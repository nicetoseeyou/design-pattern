package com.dodo.lab.head_first_design_patterns.proxy.gumball;

import java.rmi.*;

public interface GumballMachineRemote extends Remote {
    public int getCount() throws RemoteException;

    public String getLocation() throws RemoteException;

    public State getState() throws RemoteException;
}
