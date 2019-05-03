package com.eshop.eshop.model.entity;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uid")
	private Long uid;
	
	
	@NotNull
	@Size(min=2, message="username should have at least 2 characters")
	@Column(name = "username")
	private String username;
	
	@NotNull
	@Size(min=4, message="password should have at least 4 characters")
	@Column(name = "password")
	private String password;
	
	@NotNull
	@Column(name = "firstname")
	private String firstname;
	
	@NotNull
	@Column(name = "lastname")
	private String lastname;
	
	@NotNull
	@Email
	@Column(name = "email")
	private String email;
	
	@NotNull
	@Column(name = "doc")
	private Timestamp doc;
	
	@Column(name = "picture")
	private byte [] picture;
	
	@Column(name = "dob")
	private Date dob;
	
	@NotNull
	@Column(name = "mobile_phone")
	private Long mobilePhone;
	
	@NotNull
	@Column(name = "address")
	private String address;
	
	@NotNull
	@Column(name = "postcode")
	private int postcode;
	
	@NotNull
	@Column(name = "city")
	private String city;

	public User() {
		
	}

	public User(String username, String password, String firstname, String lastname, String email, Timestamp doc,
			byte[] picture, Date dob, Long mobilePhone, String address, int postcode, String city) {
		this.username = username;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.doc = doc;
		this.picture = picture;
		this.dob = dob;
		this.mobilePhone = mobilePhone;
		this.address = address;
		this.postcode = postcode;
		this.city = city;
	}

	public Long getUid() {
		return uid;
	}

	public void setUid(Long uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getDoc() {
		return doc;
	}

	public void setDoc(Timestamp doc) {
		this.doc = doc;
	}

	public byte[] getPicture() {
		return picture;
	}

	public void setPicture(byte[] picture) {
		this.picture = picture;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public Long getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(Long mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", firstname=" + firstname + ", lastname="
				+ lastname + ", email=" + email + ", doc=" + doc + ", picture=" + Arrays.toString(picture) + ", dob="
				+ dob + ", mobilePhone=" + mobilePhone + ", address=" + address + ", postcode=" + postcode + ", city="
				+ city + "]";
	}
	
}
