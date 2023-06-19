package com.service.model;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "id")
	@Nonnull
	private int id;
	
	@Column(name = "first_name", length = 15)
	@Nonnull
	private String firstName;

	@Column(name = "last_name", length = 15)
	@Nonnull
	private String lastName;
	
	@Column(name = "email_address", length = 50)
	@Nonnull
	private String emailAddress;
	
	@Column(name = "created_at",length = 20)
	@Nonnull
	private String createdAt;
	
	@Column(name = "deleted_at", length = 20)
	@Nonnull
	private String deletedAt;
	
	@Column(name = "merged_at", length = 20)
	@Nonnull
	private String mergedAt;
	
	@Column(name = "parent_user_id")
	@Nonnull
	private int parentUserId;
	
	
	
	public User() {
	}

	public User(int id, String firstName, String lastName, String emailAddress, String createdAt, String deletedAt,
			String mergedAt, int parentUserId) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailAddress = emailAddress;
		this.createdAt = createdAt;
		this.deletedAt = deletedAt;
		this.mergedAt = mergedAt;
		this.parentUserId = parentUserId;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getDeletedAt() {
		return deletedAt;
	}
	
	public String getMergedAt() {
		return mergedAt;
	}
	
	public int getParentUserId() {
		return parentUserId;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailAddress="
				+ emailAddress + ", createdAt=" + createdAt + ", deletedAt=" + deletedAt + ", mergedAt=" + mergedAt
				+ ", parentUserId=" + parentUserId + "]";
	}
	

}
