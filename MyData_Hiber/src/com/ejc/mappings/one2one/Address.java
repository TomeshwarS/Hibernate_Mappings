package com.ejc.mappings.one2one;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Address")
public class Address {
	
	public Address() {
		
		 System.out.println("Address Costructotr !!!!");
	}
	
	
	
	@Id
	@Column(name="addrid")
	@GeneratedValue
	private  Integer addressId;
	
	@Column(name="place")
	private String place;
	
	@OneToOne(targetEntity=Student.class,cascade=CascadeType.ALL)
	@JoinColumn(name="stu_id_1",referencedColumnName="sid")
	private  Student  parent;

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public Student getParent() {
		return parent;
	}

	public void setParent(Student parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", place=" + place + ", parent=" + parent + "]";
	}
}
