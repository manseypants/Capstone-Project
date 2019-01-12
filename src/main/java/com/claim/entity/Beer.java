package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beer {
	
	@Id
	int beerNumber;
	@Column
	String beerName;
	@Column
	String beerStyle;
	@Column
	String canOrBottle;
	@Column
	double alcohol;
	
	public Beer() {
		
	}
	
	public Beer(int beerNumber, String beerName, String beerStyle, String canOrBottle, double alcohol) {
		super();
		this.beerNumber = beerNumber;
		this.beerName = beerName;
		this.beerStyle = beerStyle;
		this.canOrBottle = canOrBottle;
		this.alcohol = alcohol;
	}
	
	public String getBeerName() {
		return beerName;
	}
	public int getBeerNumber() {
		return beerNumber;
	}
	public void setBeerNumber(int beerNumber) {
		this.beerNumber = beerNumber;
	}
	public void setBeerName(String beerName) {
		this.beerName = beerName;
	}
	public String getBeerStyle() {
		return beerStyle;
	}
	public void setBeerStyle(String beerStyle) {
		this.beerStyle = beerStyle;
	}
	public String getCanOrBottle() {
		return canOrBottle;
	}
	public void setCanOrBottle(String canOrBottle) {
		this.canOrBottle = canOrBottle;
	}

	public double getAlcohol() {
		return alcohol;
	}
	public void setAlcohol(double alcohol) {
		this.alcohol = alcohol;
	}

	@Override
	public String toString() {
		return "Beer [beerNumber=" + beerNumber + ", beerName=" + beerName + ", beerStyle=" + beerStyle
				+ ", canOrBottle=" + canOrBottle + ", alcohol=" + alcohol + "]";
	}
	
	
	

}
