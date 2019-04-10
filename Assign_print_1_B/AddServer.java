
//============================================================================
//
//  Name        : AddServer.java
//  Author      : Sachin Vijaykumar Kunte
//  Copyright   : Copyright ©2019 by Sachin Kunte All rights reserved.
//  Description : A Java program for a Server 
//  contact     : kuntesv@gmail.com
//
//============================================================================


import java.net.*;
import java.rmi.*;
public class AddServer {
public static void main(String args[]) {
try {
AddServerImpl addServerImpl = new AddServerImpl();
Naming.rebind("AddServer", addServerImpl);
}
catch(Exception e) {
System.out.println("Exception: " + e);
}
}
}
