package com.claim.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity//sending to SQL database
public class Tasks {

	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.AUTO)//make the number auto-generated.
	int taskNumber;
	@Column
	String taskName;
	@Column
	String startDate;
	@Column
	String endDate;
	@Column
	String description;
	@Column
	int repNumber;
	
	public Tasks() {
		
	}
	
	
	public Tasks(int taskNumber, String taskName, String startDate, String endDate, String description, int repNumber) {
		super();
		this.taskNumber = taskNumber;
		this.taskName = taskName;
		this.startDate = startDate;
		this.endDate = endDate;
		this.description = description;
		this.repNumber = repNumber;
	}
	public int getTaskNumber() {
		return taskNumber;
	}
	public void setTaskNumber(int tastNumber) {
		this.taskNumber = tastNumber;
	}
	public String getTaskName() {
		return taskName;
	}
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getRepNumber() {
		return repNumber;
	}
	public void setRepNumber(int repNumber) {
		this.repNumber = repNumber;
	}
	@Override
	public String toString() {
		return "Tasks [taskName=" + taskName + ", startDate=" + startDate + ", endDate=" + endDate + ", description="
				+ description + ", repNumber=" + repNumber + "]";
	}
	
	
}
