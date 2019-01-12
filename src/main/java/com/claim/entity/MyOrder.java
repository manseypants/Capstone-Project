package com.claim.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class MyOrder {
	
	
	
	@Id
	@Column
	int orderNumber;
	@Column
	String accountName;
	@Transient
	ArrayList<Beer> beerList = new ArrayList<>();
	
	public int getOrderNumber() {
		return orderNumber;
	}
	public void setOrderNumber(int orderNumber) {
		this.orderNumber = orderNumber;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public ArrayList<Beer> getBeerList() {
		return beerList;
	}
	public void setBeerList(ArrayList<Beer> beerList) {
		this.beerList = beerList;
	}
	
	@Override
	public String toString() {
		return "MyOrder [orderNumber=" + orderNumber + ", accountName=" + accountName + ", beerList=" + beerList + "]";
	}
}