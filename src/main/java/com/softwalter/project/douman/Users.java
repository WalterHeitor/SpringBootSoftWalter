package com.softwalter.project.douman;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Users {

	private Long id;
	private String nome;
	private String email;
	private String password;
	private List<Request>requests = new ArrayList<>();
	
}
