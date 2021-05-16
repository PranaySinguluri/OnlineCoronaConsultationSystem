package com.coronaconsultation.service;

import java.util.Optional;

import com.coronaconsultation.entities.Medicine;

import antlr.collections.List;

public interface MedicineService {

	public Medicine savemed(Medicine med);
//	public java.util.List<Medicine>  getAllmeds();
	public Medicine updateMed(Medicine med);
	public Optional<Medicine> getMedicineById(int id);
	public void deleteMed(int id);
	
}
