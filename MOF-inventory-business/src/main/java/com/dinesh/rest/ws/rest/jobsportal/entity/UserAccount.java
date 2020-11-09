package com.dinesh.rest.ws.rest.jobsportal.entity;
import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the user_account database table.
 * 
 */

@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true, value = {"hibernateLazyInitializer", "handler", "fieldHandler"})
@Entity
@Table(name="user_account")
@NamedQuery(name="UserAccount.findAll", query="SELECT u FROM UserAccount u")
public class UserAccount implements Serializable {
	private static final long serialVersionUID = 1L;
	// <form (ngSubmit)="!userForm.invalid && onSave()" #userForm="ngForm">
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(length=255)
	private String email;
	
	@Column(length=255,unique = true)
	private String username;
	

	@Column(length=100)
	private String password;
	
	@Column(name="firstname", length=50)
	private String firstname;
	
	@Column(name="lastmname", length=50)
	private String lasttname;
	
	
	@Column(name="contact_number", length=15)
	private String contactNumber;

	@Temporal(TemporalType.DATE)
	@Column(name="date_of_birth")
	private Date dateOfBirth;

	

	@Column(name="email_notification_active", length=1)
	private String emailNotificationActive;

	@Column(length=1)
	private String gender;

	@Column(name="is_active", length=1)
	private String isActive;



	@Temporal(TemporalType.DATE)
	@Column(name="registration_date")
	private Date registrationDate;

	@Column(name="sms_notification_active", length=1)
	private String smsNotificationActive;

	@Lob
	@Column(name="user_image")
	private byte[] userImage;




	//bi-directional many-to-one association to UserType
	@JsonIgnoreProperties(ignoreUnknown = true, value = {"userAccounts"})
	//@JsonIgnoreProperties(ignoreUnknown = true, value = {"userAccounts", "hibernateLazyInitializer"})
	
	//@JsonManagedReference(value="user-type")
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="user_type_id")
	private UserType userType;



	public UserAccount() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLasttname() {
		return lasttname;
	}

	public void setLasttname(String lasttname) {
		this.lasttname = lasttname;
	}

	
	public String getContactNumber() {
		return this.contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public Date getDateOfBirth() {
		return this.dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmailNotificationActive() {
		return this.emailNotificationActive;
	}

	public void setEmailNotificationActive(String emailNotificationActive) {
		this.emailNotificationActive = emailNotificationActive;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsActive() {
		return this.isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistrationDate() {
		return this.registrationDate;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

	public String getSmsNotificationActive() {
		return this.smsNotificationActive;
	}

	public void setSmsNotificationActive(String smsNotificationActive) {
		this.smsNotificationActive = smsNotificationActive;
	}

	public byte[] getUserImage() {
		return this.userImage;
	}

	public void setUserImage(byte[] userImage) {
		this.userImage = userImage;
	}

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}


}