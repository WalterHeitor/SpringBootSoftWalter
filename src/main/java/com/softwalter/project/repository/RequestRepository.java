package com.softwalter.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.softwalter.project.douman.Request;
import com.softwalter.project.douman.RequestStages;

public interface RequestRepository extends JpaRepository<Request, Long>{

	public List<Request>findAllOwnerById(Long id);
	
	@Query("UPDATE Request set states = ?2 WHERE id = ?1")
	public Request updateStatus(Long id, RequestStages stages);
	
}
