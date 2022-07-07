package com.neoSoft.studentPoc.RepoInt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neoSoft.studentPoc.dto.ProjectDTO;

@Repository
public interface ProjectRepo extends JpaRepository<ProjectDTO, Long>{

	
}
