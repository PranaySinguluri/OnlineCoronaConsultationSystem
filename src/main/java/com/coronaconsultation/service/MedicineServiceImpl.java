package com.coronaconsultation.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.coronaconsultation.entities.Medicine;
import com.coronaconsultation.repository.MedicineRepository;


public class MedicineServiceImpl implements MedicineService{

	@Autowired
	private MedicineRepository repo;
	
	@Override
	public Medicine savemed(Medicine med) {
		// TODO Auto-generated method stub
		return repo.save(med);
	}

	

	@Override
	public Medicine updateMed(Medicine med) {
		// TODO Auto-generated method stub
		return repo.save(med);
	}

	@Override
	public Optional<Medicine> getMedicineById(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public void deleteMed(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		
	}

	

	
}
