package com.model;

import java.io.Serializable;

public class Beverage implements Serializable {
	
	private static final long serialVersionUID = -5577579081118070434L;
	
	private int beverageId;
	private String beveragType;
	private String beverageName;
	private int beverageQty;
	private double beveragePrice;
	
	
	public int getBeverageId() {
		
		return beverageId;
		
	}
	
	public void setBeverageId(int beverageId) {
		
		this.beverageId = beverageId;
		
	}
	
	public String getBeveragType() {
		
		return beveragType;
		
	}
	
	public void setBeveragType(String beveragType) {
		
		this.beveragType = beveragType;
		
	}
	
	public String getBeverageName() {
		
		return beverageName;
		
	}
	
	public void setBeverageName(String beverageName) {
		
		this.beverageName = beverageName;
		
	}
	
	public int getBeverageQty() {
		
		return beverageQty;
		
	}

	public void setBeverageQty(int beverageQty) {
		
		this.beverageQty = beverageQty;
		
	}
	
	public double getBeveragePrice() {
		
		return beveragePrice;
		
	}
	
	public void setBeveragePrice(double beveragePrice) {
		
		this.beveragePrice = beveragePrice;
		
	}

	@Override
	public String toString() {
		return "Beverage [beverageId=" + beverageId + ", beveragType=" + beveragType + ", beverageName=" + beverageName
				+ ", beverageQty=" + beverageQty + ", beveragePrice=" + beveragePrice + "]";
	} 

}
