package com.ejc.mappings.one2one;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="students")
public class Student {
	
	public Student(){
 System.out.println("Student -- Constructor ");		
		
	}
	@Id
	@Column(name="sid")
	@GeneratedValue
	private int studentId;
	
	@Column(name="sname", length=10)
	private String studentName;
	
	@Column(name="grp",length=10)
	private String grp;
	
	public String getGrp() {
		return grp;
	}
	public void setGrp(String grp) {
		this.grp = grp;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	
	

}
