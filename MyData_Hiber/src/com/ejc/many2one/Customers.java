package com.ejc.many2one;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Customers")
public class Customers{

	@Id
	@Column(name = "custid")
	private Integer customerId;
	
	@Column(name = "custName", length=10)
	private String customerName;

    
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="venid",referencedColumnName="vid")
	private Vendor parent;


	public Integer getCustomerId() {
		return customerId;
	}


	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public Vendor getParent() {
		return parent;
	}


	public void setParent(Vendor parent) {
		this.parent = parent;
	}


	@Override
	public String toString() {
		return "Customers [customerId=" + customerId + ", customerName=" + customerName + ", parent=" + parent + "]";
	}
	
		
}