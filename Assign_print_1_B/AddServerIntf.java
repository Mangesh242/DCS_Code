
//============================================================================
//
//  Name        : AddServerintf.java
//  Author      : Sachin Vijaykumar Kunte
//  Copyright   : Copyright ©2019 by Sachin Kunte All rights reserved.
//  Description : A Java program for a server interface 
//  contact     : kuntesv@gmail.com
//
//============================================================================

import java.rmi.*;
public interface AddServerIntf extends Remote {
double add(double d1, double d2) throws RemoteException;
}
