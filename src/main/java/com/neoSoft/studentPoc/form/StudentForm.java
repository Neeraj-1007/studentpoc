package com.neoSoft.studentPoc.form;

import com.neoSoft.studentPoc.dto.ProjectDTO;
import com.neoSoft.studentPoc.dto.StudentDTO;

public class StudentForm {

	private String firstName;
	private String lastName;
	private String mobileNumber;
	private String emailAddress;
	private ProjectDTO project;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public ProjectDTO getProject() {
		return project;
	}

	public void setProject(ProjectDTO project) {
		this.project = project;
	}

	public StudentDTO populateDTO() {
		StudentDTO dto = new StudentDTO();
		dto.setFirstName(firstName);
		dto.setLastName(lastName);
		dto.setMobileNumber(mobileNumber);
		dto.setEmailAddress(emailAddress);
		dto.setProject(project);
		return dto;
	
	}
	public void getDTO() {
		this.firstName=firstName;
		this.lastName=lastName;
		this.mobileNumber=mobileNumber;
		this.emailAddress=emailAddress;
		this.project=project;
		
	}

}
