package com.neoSoft.studentPoc.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neoSoft.studentPoc.dto.ProjectDTO;
import com.neoSoft.studentPoc.dto.StudentDTO;
import com.neoSoft.studentPoc.form.StudentForm;
import com.neoSoft.studentPoc.service.StudentService;

@RestController
@RequestMapping("/v1/app")
public class StudentController {

//	,,@RequestBody StudentForm form
	@Autowired
	private StudentService service;

	@PostMapping("/save")
	public long save(@RequestBody StudentDTO dto) {
		System.out.println("in get mapping");
//		StudentDTO dto = form.populateDTO();
		long pk = service.save(dto);
		return pk;
	}

	@GetMapping("/getList")
	public List<StudentDTO> getList() {
		List<StudentDTO> list = service.getList();
		return list;
	}
	
	@GetMapping("/get/{id}")
	public Optional<StudentDTO> getByPK(@PathVariable long id) {
		System.out.println(id+"============================");
		Optional<StudentDTO> list = service.getByPK(id);
		return list;
	}

}
