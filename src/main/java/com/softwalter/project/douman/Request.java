package com.softwalter.project.douman;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.softwalter.project.douman.enums.RequestStates;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Request {

	private Long id;
	private String subject;
	private String description;
	private Date creationDate;
	private RequestStates requestStates;
	private Users users;
	private List<RequestStates>states = new ArrayList<RequestStates>();
	public Request(Long id, String subject, String description,
				Date creationDate, RequestStates requestStates,
				Users users) {
		super();
		this.id = id;
		this.subject = subject;
		this.description = description;
		this.creationDate = creationDate;
		this.requestStates = requestStates;
		this.users = users;
	}
	
	
	
	
}
