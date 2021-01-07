package com.softwalter.project.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.softwalter.project.douman.RequestStages;
@Repository
public interface RequestStagesRepository extends JpaRepository<RequestStages, Long>{

	public List<RequestStages>findAllByRequestId(Long id);
}
