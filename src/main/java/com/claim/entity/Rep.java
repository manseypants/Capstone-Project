package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Rep {
	
	@Id
	int repNumber;
	@Column
	String firstName;
	@Column
	String lastName;
	@Column
	String telephone;
	@Column
	String email;
	@Column
	String userName;
	@Column
	String password;
	
	public Rep() {
		
	}
	
	
	public Rep(int repNumber, String firstName, String lastName, String telephone, String email, String userName,
			String password) {
		super();
		this.repNumber = repNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.telephone = telephone;
		this.email = email;
		this.userName = userName;
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getRepNumber() {
		return repNumber;
	}
	public void setRepNumber(int repNumber) {
		this.repNumber = repNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Rep [repNumber=" + repNumber + ", firstName=" + firstName + ", lastName=" + lastName + ", telephone="
				+ telephone + ", email=" + email + ", userName=" + userName + ", password=" + password + "]";
	}

}
