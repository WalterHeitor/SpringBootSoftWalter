package com.softwalter.project.douman;

import java.io.Serializable;
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
public class Request implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

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
	@JoinColumn(name = "owenr_id")
	private Users owenr;
	
	@OneToMany(mappedBy = "request")
	private List<RequestStages>states = new ArrayList<>();
	
	
	
	
	
	
}
