package com.coronaconsultation.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity
@Validated
@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "medicine_id", scope = Integer.class)
public class Medicine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
		private int medicine_id;

	@Column(nullable= false)
	private String name;
	
	//@Column(name="medicine_price")
	@Column(nullable= false)

	private int price;
	@Column(nullable= false)
	//@Column(name="manufacture_date")
	private LocalDate manufactureDate;
	
	@Column(nullable= false)

	//@Column(name="expiry_date")
	private LocalDate expiryDate;
	
	@Column(nullable= false)
	private int stockLeft;

}
