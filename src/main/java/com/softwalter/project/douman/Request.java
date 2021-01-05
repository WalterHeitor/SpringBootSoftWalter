package com.softwalter.project.douman;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.softwalter.project.douman.enums.RequestStates;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Request {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String subject;
	@Column(columnDefinition = "text")
	private String description;
	@Column(name = "creation_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationDate;
	@Column
	@Enumerated(EnumType.STRING)
	private RequestStates requestStates;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private Users users;
	
	@OneToMany(mappedBy = "request")
	private List<RequestStages>states = new ArrayList<>();
	
	
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
