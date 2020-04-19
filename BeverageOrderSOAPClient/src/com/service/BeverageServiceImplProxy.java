package com.service;

public class BeverageServiceImplProxy implements com.service.BeverageServiceImpl {
  private String _endpoint = null;
  private com.service.BeverageServiceImpl beverageServiceImpl = null;
  
  public BeverageServiceImplProxy() {
    _initBeverageServiceImplProxy();
  }
  
  public BeverageServiceImplProxy(String endpoint) {
    _endpoint = endpoint;
    _initBeverageServiceImplProxy();
  }
  
  private void _initBeverageServiceImplProxy() {
    try {
      beverageServiceImpl = (new com.service.BeverageServiceImplServiceLocator()).getBeverageServiceImpl();
      if (beverageServiceImpl != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)beverageServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)beverageServiceImpl)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (beverageServiceImpl != null)
      ((javax.xml.rpc.Stub)beverageServiceImpl)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.service.BeverageServiceImpl getBeverageServiceImpl() {
    if (beverageServiceImpl == null)
      _initBeverageServiceImplProxy();
    return beverageServiceImpl;
  }
  
  public boolean deleteBeverage(int beverageId) throws java.rmi.RemoteException{
    if (beverageServiceImpl == null)
      _initBeverageServiceImplProxy();
    return beverageServiceImpl.deleteBeverage(beverageId);
  }
  
  public boolean addBeverage(com.model.Beverage b) throws java.rmi.RemoteException{
    if (beverageServiceImpl == null)
      _initBeverageServiceImplProxy();
    return beverageServiceImpl.addBeverage(b);
  }
  
  public com.model.Beverage getBeverage(int beverageId) throws java.rmi.RemoteException{
    if (beverageServiceImpl == null)
      _initBeverageServiceImplProxy();
    return beverageServiceImpl.getBeverage(beverageId);
  }
  
  public com.model.Beverage[] getAllBeverages() throws java.rmi.RemoteException{
    if (beverageServiceImpl == null)
      _initBeverageServiceImplProxy();
    return beverageServiceImpl.getAllBeverages();
  }
  
  
}