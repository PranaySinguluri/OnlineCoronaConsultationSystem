package com.coronaconsultation.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Patient {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int patientId;
    private String patientName;
    private long mobileNumber;
    private String address;
    private Date appointment;
//    private boolean status;
}
