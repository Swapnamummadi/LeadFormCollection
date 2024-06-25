package com.form.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "leads")

public class Lead {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;

    private String name;
    private String email;
    private String phone;
    private String company;
    private String inquiry;
    
	public Lead() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lead(Long id, String name, String email, String phone, String company, String inquiry) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.company = company;
		this.inquiry = inquiry;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getInquiry() {
		return inquiry;
	}

	public void setInquiry(String inquiry) {
		this.inquiry = inquiry;
	}

	@Override
	public String toString() {
		return "Lead [id=" + id + ", name=" + name + ", email=" + email + ", phone=" + phone + ", company=" + company
				+ ", inquiry=" + inquiry + "]";
	}
	
	
    
}
