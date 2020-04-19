package com.service;

import com.model.Beverage;

public interface BeverageService {

	public boolean addBeverage(Beverage beverage);
	
	public boolean deleteBeverage(int beverageId);
	
	public Beverage getBeverage(int beverageId);
	
	public Beverage[] getAllBeverages();
	
}
