package com.softwalter.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.softwalter.project.douman.Request;

public interface RequestRepository extends JpaRepository<Request, Long>{

}
