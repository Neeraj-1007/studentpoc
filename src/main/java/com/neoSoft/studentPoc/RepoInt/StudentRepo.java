package com.neoSoft.studentPoc.RepoInt;

import javax.persistence.Id;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neoSoft.studentPoc.dto.StudentDTO;

@Repository
public interface StudentRepo extends JpaRepository<StudentDTO, Long>{

	
}
