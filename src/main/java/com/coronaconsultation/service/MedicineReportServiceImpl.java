package com.coronaconsultation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coronaconsultation.entities.Medicine;
import com.coronaconsultation.entities.MedicineReport;
import com.coronaconsultation.exceptions.MedicineIdNotFoundException;
import com.coronaconsultation.exceptions.MedicineReportIdNotFoundException;
import com.coronaconsultation.repository.MedicineReportRepo;
@Service
public class MedicineReportServiceImpl implements MedicineReportService {
	@Autowired
	private MedicineReportRepo repo;
	
	@Override
	public List<MedicineReport> getAllreports() {
		
		return repo.findAll();
	}

	@Override
	public Optional<MedicineReport> getpatientreports(int id) throws MedicineReportIdNotFoundException {
		 try {
	    	   return repo.findById(id);
	       }
	       catch (Exception e) {
	    	   throw new  MedicineReportIdNotFoundException(id);
	       }
	}

	@Override
	public MedicineReport saveReport(MedicineReport med) {
		
		return repo.save(med);
	
	}

}
