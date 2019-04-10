
//============================================================================
//
//  Name        : AddServerImpl.java
//  Author      : Sachin Vijaykumar Kunte
//  Copyright   : Copyright ©2019 by Sachin Kunte All rights reserved.
//  Description : A Java program for a server side function implementation 
//  contact     : kuntesv@gmail.com
//
//============================================================================

import java.rmi.*;
import java.rmi.server.*;
public class AddServerImpl extends UnicastRemoteObject
implements AddServerIntf {
public AddServerImpl() throws RemoteException {
}
public double add(double d1, double d2) throws RemoteException {
return d1 + d2;
}
}
