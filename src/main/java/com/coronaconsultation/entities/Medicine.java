package com.coronaconsultation.entities;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;

@Entity

@Data
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "medicine_id", scope = Integer.class)
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
		private int medicineId;

	@Column(nullable= false)
	private String name;
	
	
	@Column(nullable= false)
 
	private int price;
	@Column(nullable= false)

	private LocalDate manufactureDate;
	
	@Column(nullable= false)

	
	private LocalDate expiryDate;
	
	@Column(nullable= false)
	private int stockLeft;

	public Medicine(int medicineId, String name, int price, LocalDate manufactureDate, LocalDate expiryDate,
			int stockLeft) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.price = price;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
		this.stockLeft = stockLeft;
	}

	public Medicine(int medicineId, String name, int price) {
		super();
		this.medicineId = medicineId;
		this.name = name;
		this.price = price;
	}

	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
