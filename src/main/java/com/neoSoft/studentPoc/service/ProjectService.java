package com.neoSoft.studentPoc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.neoSoft.studentPoc.RepoInt.ProjectRepo;
import com.neoSoft.studentPoc.dto.ProjectDTO;

@Service
public class ProjectService {

	@Autowired
	private ProjectRepo repo;

	@Transactional
	public long save(ProjectDTO dto) {
		dto = repo.save(dto);
		return dto.getProjid();
	}

}
