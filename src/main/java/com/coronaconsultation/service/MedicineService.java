package com.coronaconsultation.service;

import java.awt.List;
import java.util.Optional;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.coronaconsultation.entities.Medicine;
import com.coronaconsultation.exceptions.MedicineIdNotFoundException;
@Component
@Service
public interface MedicineService {

	public Medicine savemed(Medicine med);
	public List  getAllmeds();
	public Medicine updateMed(Medicine med);
	public Optional<Medicine> getMedicineById(int medicine_id) throws MedicineIdNotFoundException ;
	public void deleteMed(int id);
	
}
