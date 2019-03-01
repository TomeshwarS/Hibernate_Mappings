package com.ejc.many2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Vendor")

public class Vendor{

	@Id
	@Column(name = "vid")
	private Integer vendorId;
	
	@Column(name = "vname", length=10)
	private String vendorName;


	public Integer getVendorId() {
		return vendorId;
	}

	public void setVendorId(Integer vendorId) {
		this.vendorId = vendorId;
	}


	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	@Override
	public String toString() {
		return "Vendor [vendorId=" + vendorId + ", vendorName=" + vendorName + "]";
	}



}	