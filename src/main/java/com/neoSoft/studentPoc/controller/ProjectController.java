package com.neoSoft.studentPoc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoSoft.studentPoc.dto.ProjectDTO;
import com.neoSoft.studentPoc.service.ProjectService;

@RestController
@RequestMapping("/v1/app")
public class ProjectController {

	@Autowired
	private ProjectService service;
	
	@GetMapping("/projectList")
	public String getList() {
		ProjectDTO dto=new ProjectDTO();
		dto.setProjname("project name");
		long pk=service.save(dto);
		return "ProjectList";
	}
	
	@PostMapping("/projectSave")
	public long save(@RequestBody ProjectDTO dto) {
		System.out.println(" in project post method");
		
		long pk=service.save(dto);
		return pk;
	}
	
}
