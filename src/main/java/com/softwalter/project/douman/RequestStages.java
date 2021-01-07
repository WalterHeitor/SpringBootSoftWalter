package com.softwalter.project.douman;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.softwalter.project.douman.enums.RequestStates;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author walhe
 *Etapas de solicitação.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class RequestStages implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(columnDefinition = "text")
	private String description;
	@Column(name = "realization_date")
	@Temporal(TemporalType.TIMESTAMP)
	private Date realizationDate;
	@Column
	private RequestStates state;
	
	@ManyToOne
	@JoinColumn(name = "request_id")
	private Request request;
	@ManyToOne
	@JoinColumn(name = "owner_id")
	private Users owner;
	
}
