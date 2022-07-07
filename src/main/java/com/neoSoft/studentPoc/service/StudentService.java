package com.neoSoft.studentPoc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.neoSoft.studentPoc.RepoInt.StudentRepo;
import com.neoSoft.studentPoc.dto.StudentDTO;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;

	@Transactional(propagation = Propagation.REQUIRES_NEW,readOnly = false)
	public long save(StudentDTO dto) {
		StudentDTO student = repo.save(dto);
		return student.getId();

	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW,readOnly = true)
	public List<StudentDTO> getList() {
		List<StudentDTO> list=repo.findAll();
		return list;
		
	}
	
	@Transactional(propagation = Propagation.REQUIRES_NEW,readOnly = true)
	public Optional<StudentDTO> getByPK(long id) {
	Optional<StudentDTO>	list=repo.findById(id);
		return list;
		
	}
}
