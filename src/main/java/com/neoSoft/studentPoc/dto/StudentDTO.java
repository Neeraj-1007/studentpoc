package com.neoSoft.studentPoc.dto;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name = "student_details")
@Data
public class StudentDTO {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;
	
	@Column(name = "firstName", length = 100)
	private String firstName;
	
	@Column(name = "lastName",length = 100)
	private String lastName;
	
	@Column(name = "mobileNumber",length = 10)
	private String mobileNumber;
	
	@Column(name = "emailAddress",length = 100)
	private String emailAddress;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "projid", referencedColumnName = "projid",unique = false)
	private ProjectDTO  project;
	


	
	

}
