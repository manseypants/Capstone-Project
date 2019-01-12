package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Account {
	
	@Id
	String accountName;
	@Column
	String accountAddress;
	@Column
	String accountContact;
	@Column
	String accountOrder;
	@Column
	String accountRep;
	@Column
	String accountTelephone;
	@Column
	int accountNumber;
	@Column
	String accountEmail;
	
	public Account() {
		
	}
	
	
	public Account(String accountName, String accountAddress, String accountContact, String accountOrder,
			String accountRep, String accountTelephone, int accountNumber, String accountEmail) {
		super();
		this.accountName = accountName;
		this.accountAddress = accountAddress;
		this.accountContact = accountContact;
		this.accountOrder = accountOrder;
		this.accountRep = accountRep;
		this.accountTelephone = accountTelephone;
		this.accountNumber = accountNumber;
		this.accountEmail = accountEmail;
		
	}


	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getAccountAddress() {
		return accountAddress;
	}
	public void setAccountAddress(String accountAddress) {
		this.accountAddress = accountAddress;
	}
	public String getAccountContact() {
		return accountContact;
	}
	public void setAccountContact(String accountContact) {
		this.accountContact = accountContact;
	}
	public String getAccountOrder() {
		return accountOrder;
	}
	public void setAccountOrder(String accountOrder) {
		this.accountOrder = accountOrder;
	}
	public String getAccountRep() {
		return accountRep;
	}
	public void setAccountRep(String accountRep) {
		this.accountRep = accountRep;
	}
	public String getAccountTelephone() {
		return accountTelephone;
	}
	public void setAccountTelephone(String accountTelephone) {
		this.accountTelephone = accountTelephone;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountEmail() {
		return accountEmail;
	}
	public void setAccountEmail(String accountEmail) {
		this.accountEmail = accountEmail;
	}
	
	
	@Override
	public String toString() {
		return "Account [accountName=" + accountName + ", accountAddress=" + accountAddress + ", accountContact="
				+ accountContact + ", accountOrder=" + accountOrder + ", accountRep=" + accountRep
				+ ", accountTelephone=" + accountTelephone + ", accountNumber=" + accountNumber + ", accountEmail="
				+ accountEmail + "]";
	}

}
