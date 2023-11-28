package com.CustomerEmployeeManagement.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@OneToOne
	private Long customerId;
	private String name;
	private int age;
	private String mobileNo;
	public Customer(Long customerId, String name, int age, String mobileNo) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", name=" + name + ", age=" + age + ", MobileNo=" + mobileNo
				+ "]";
	}
	
	

}
