package com.softwalter.project.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.softwalter.project.douman.Users;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long>{

	@Query("select u from user u where u.email = :email and u.password = :password ")
	//@Query("select from user where email = ? and password = ? ;")
	public Optional<Users>login(@Param("email")String email, @Param("password") String password);
}
