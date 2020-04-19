package com.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.model.Beverage;

public class BeverageServiceImpl implements BeverageService{

		private static Map<Integer,Beverage> beverage = new HashMap<Integer,Beverage>();

		
		@Override
		public boolean addBeverage(Beverage b) {
			
			if(beverage.get(b.getBeverageId()) != null) return false;
			beverage.put(b.getBeverageId(), b);
			
			return true;
		}
		

		@Override
		public boolean deleteBeverage(int beverageId) {
			
			if(beverage.get(beverageId) == null) return false;
			beverage.remove(beverageId);
			
			return true;
		}
		

		@Override
		public Beverage getBeverage(int beverageId) {
			
			return beverage.get(beverageId);
			
		}
		

		@Override
		public Beverage[] getAllBeverages() {
			
			Set<Integer> ids = beverage.keySet();
			Beverage[] b = new Beverage[ids.size()];
			
			int i=0;
			
			for(Integer beverageId : ids){
				b[i] = beverage.get(beverageId);
				i++;
			}
			
			return b;
		}

}
