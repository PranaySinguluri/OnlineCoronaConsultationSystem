package com.coronaconsultation.entities;


import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "medicineReportId", scope = Integer.class)
public class MedicineReport {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer  medicineReportId;
	
	private Date reportdate;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Patient patient;
	
}
