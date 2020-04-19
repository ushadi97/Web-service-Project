/**
 * BeverageServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.service;

public class BeverageServiceImplServiceLocator extends org.apache.axis.client.Service implements com.service.BeverageServiceImplService {

    public BeverageServiceImplServiceLocator() {
    }


    public BeverageServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public BeverageServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for BeverageServiceImpl
    private java.lang.String BeverageServiceImpl_address = "http://localhost:8082/BeverageOrderSOAP/services/BeverageServiceImpl";

    public java.lang.String getBeverageServiceImplAddress() {
        return BeverageServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String BeverageServiceImplWSDDServiceName = "BeverageServiceImpl";

    public java.lang.String getBeverageServiceImplWSDDServiceName() {
        return BeverageServiceImplWSDDServiceName;
    }

    public void setBeverageServiceImplWSDDServiceName(java.lang.String name) {
        BeverageServiceImplWSDDServiceName = name;
    }

    public com.service.BeverageServiceImpl getBeverageServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(BeverageServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getBeverageServiceImpl(endpoint);
    }

    public com.service.BeverageServiceImpl getBeverageServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.service.BeverageServiceImplSoapBindingStub _stub = new com.service.BeverageServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getBeverageServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setBeverageServiceImplEndpointAddress(java.lang.String address) {
        BeverageServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.service.BeverageServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.service.BeverageServiceImplSoapBindingStub _stub = new com.service.BeverageServiceImplSoapBindingStub(new java.net.URL(BeverageServiceImpl_address), this);
                _stub.setPortName(getBeverageServiceImplWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("BeverageServiceImpl".equals(inputPortName)) {
            return getBeverageServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.com", "BeverageServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.com", "BeverageServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("BeverageServiceImpl".equals(portName)) {
            setBeverageServiceImplEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
