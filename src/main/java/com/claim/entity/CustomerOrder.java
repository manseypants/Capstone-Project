package com.claim.entity;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CustomerOrder {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int custOrderId;
	
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)
	int orderNumber;
	
	@Column
	String accountName;
	
	@Column
	String beerNames;
	
	@Column
	int repNumber;

	public CustomerOrder(int custOrderId, int orderNumber, String accountName, int beerId, int repNumber) {
		super();
		this.custOrderId = custOrderId;
		this.orderNumber = orderNumber;
		this.accountName = accountName;
		this.repNumber = repNumber;
	}
	
	public CustomerOrder() {}
	public int getCustOrderId() {
		return custOrderId;
	}

	public void setCustOrderId(int custOrderId) {
		this.custOrderId = custOrderId;
	}

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

	

	public String getBeerNames() {
		return beerNames;
	}

	public void setBeerNames(String beerNames) {
		this.beerNames = beerNames;
	}

	public int getRepNumber() {
		return repNumber;
	}

	public void setRepNumber(int repNumber) {
		this.repNumber = repNumber;
	}

	@Override
	public String toString() {
		return "CustomerOrder [custOrderId=" + custOrderId + ", orderNumber=" + orderNumber + ", accountName="
				+ accountName + ", repNumber=" + repNumber + "]";
	}
}
