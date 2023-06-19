package com.csvtobroker.model;

import java.io.Serializable;

import com.opencsv.bean.CsvBindByName;

public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@CsvBindByName(column = "id")
	private int id;
	
	@CsvBindByName(column = "first_name")
	private String firstName;
	
	@CsvBindByName(column = "last_name")
	private String lastName;
	
	@CsvBindByName(column = "email_address")
	private String emailAddress;
	
	@CsvBindByName(column = "created_at")
	private String createdAt;
	
	@CsvBindByName(column = "deleted_at")
	private String deletedAt;
	
	@CsvBindByName(column = "merged_at")
	private String mergedAt;
	
	@CsvBindByName(column = "parent_user_id")
	private int parentUserId;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}
	public String getDeletedAt() {
		return deletedAt;
	}
	public void setDeletedAt(String deletedAt) {
		this.deletedAt = deletedAt;
	}
	public String getMergedAt() {
		return mergedAt;
	}
	public void setMergedAt(String mergedAt) {
		this.mergedAt = mergedAt;
	}
	public int getParentUserId() {
		return parentUserId;
	}
	public void setParentUserId(int parentUserId) {
		this.parentUserId = parentUserId;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", createdAt=" + createdAt + ", deletedAt=" + deletedAt + ", mergedAt=" + mergedAt
				+ ", parentUserId=" + parentUserId + "]";
	}
	

}
