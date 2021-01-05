package com.softwalter.project.douman;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.softwalter.project.douman.enums.RequestStates;
import com.softwalter.project.douman.enums.Role;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "user")
public class Users {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nome;
	@Column
	private String email;
	@Column
	private String password;
	
	@Column
	@Enumerated(EnumType.STRING)
	private Role role;
	
	@OneToMany(mappedBy = "users")
	private List<Request>requests = new ArrayList<>();
	
	@OneToMany(mappedBy = "users")
	private List<RequestStates>states = new ArrayList<>();
	
}
