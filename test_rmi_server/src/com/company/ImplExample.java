package com.company;

import com.company.Hello;

import java.rmi.RemoteException;

public class ImplExample implements Hello {
    @Override
    public void printMsg() throws RemoteException {
        System.out.println("This RMI Server Example");
    }
}
