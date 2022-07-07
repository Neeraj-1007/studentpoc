package com.neoSoft.studentPoc.form;

import com.neoSoft.studentPoc.dto.ProjectDTO;

public class ProjectForm {

	
	private String projname;
	private String duration;
	
	

	public String getProjname() {
		return projname;
	}
	public void setProjname(String projname) {
		this.projname = projname;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public void populatedto() {
		
	}
	
	public ProjectDTO getDTO() {
		ProjectDTO dto=new ProjectDTO();
		return dto;
	}
}
