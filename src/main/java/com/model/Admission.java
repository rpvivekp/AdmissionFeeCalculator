package com.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
 
import org.springframework.stereotype.Component;


//use appropriate annotation to configure the Admission class as Component
@Component
public class Admission {
   @NotNull
   	@Size(min=6, max=6, message = "Admission Id should be a 6 digit positive number")
	private String admissionId;
	private String deptName;
	private String preferHostel;
	private String firstGraduateInfo;
	private double tuitionFees;

	public String getAdmissionId() {
		return admissionId;
	}
	public void setAdmissionId(String admissionId) {
		this.admissionId = admissionId;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getPreferHostel() {
		return preferHostel;
	}
	public void setPreferHostel(String preferHostel) {
		this.preferHostel = preferHostel;
	}
	public String getFirstGraduateInfo() {
		return firstGraduateInfo;
	}
	public void setFirstGraduateInfo(String firstGraduateInfo) {
		this.firstGraduateInfo = firstGraduateInfo;
	}
	public double getTuitionFees() {
		return tuitionFees;
	}
	public void setTuitionFees(double tuitionFees) {
		this.tuitionFees = tuitionFees;
	}
	
	

}
