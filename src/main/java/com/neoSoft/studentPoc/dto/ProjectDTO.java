package com.neoSoft.studentPoc.dto;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "project_details")
@Data
public class ProjectDTO implements Serializable{
	
	@Id
//	 @GeneratedValue(strategy = GenerationType.TABLE)
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "ID",unique = true, nullable = false)
	private Long id;
	
	@Column(name = "projid",unique = false)
	private Long projid;
	
	@Column(name = "projname")
	private String projname;
	
	@Column(name = "duration")
	private String duration;
	
	@OneToMany(targetEntity = StudentDTO.class,cascade =CascadeType.ALL)
	private List<StudentDTO> student;

	
}
