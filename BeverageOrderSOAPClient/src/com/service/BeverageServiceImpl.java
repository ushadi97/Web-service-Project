/**
 * BeverageServiceImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service;

public interface BeverageServiceImpl extends java.rmi.Remote {
    public boolean deleteBeverage(int beverageId) throws java.rmi.RemoteException;
    public boolean addBeverage(com.model.Beverage b) throws java.rmi.RemoteException;
    public com.model.Beverage getBeverage(int beverageId) throws java.rmi.RemoteException;
    public com.model.Beverage[] getAllBeverages() throws java.rmi.RemoteException;
}
