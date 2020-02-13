package com.company;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class TestRMIServer {

    public static void main(String[] args) {
        ImplExample obj = new ImplExample();

        try {
            Hello sub = (Hello) UnicastRemoteObject.exportObject(obj,5000);
            Registry registry = LocateRegistry.createRegistry(5000);
            registry.bind("Hello",sub);
            System.out.println("Server Ready");
        } catch (RemoteException | AlreadyBoundException e) {
            e.printStackTrace();
        }

    }
}
