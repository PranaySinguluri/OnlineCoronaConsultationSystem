package com.coronaconsultation.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coronaconsultation.entities.Medicine;
import com.coronaconsultation.entities.MedicineReport;
import com.coronaconsultation.repository.MedicineReportRepo;
import com.coronaconsultation.repository.MedicineRepository;
import com.coronaconsultation.service.MedicineService;

@RestController
@RequestMapping(value="/api/medicine")
public class MedicineController {

	@Autowired(required=true)
	private MedicineRepository repo;
	
	@Autowired
	private MedicineService service;
	                                           		 
	                                         
	@GetMapping(value="/getallmeds")
	public List<Medicine> getallReports(){
     return repo.findAll();
     }
	@PostMapping("/savemed")
	public ResponseEntity<String> saveReport(@Validated @RequestBody Medicine med) {
	
	if(!repo.existsById(med.getId())) {
		service.savemed(med);
	return new ResponseEntity<String>("Saved Medicine Details Successfully",HttpStatus.ACCEPTED);
	}
	else {
		return new ResponseEntity<String>("Medicine Id Found in Database Please update",HttpStatus.BAD_REQUEST);
	}
	}
	
	@PutMapping(value="/updatemeds")
	public ResponseEntity<String> updatePatient(@Validated @RequestBody Medicine med) {
		if(repo.existsById(med.getId())) {
			service.updateMed(med);
		return new ResponseEntity<String>("Saved Medicine Details Successfully",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("Medicine Id Not Found in Database Please Provide details by saving",HttpStatus.BAD_REQUEST);
		}
	}
	@GetMapping(value="/getmedbyId/{id}")
	public ResponseEntity<String> getMedicineById(@Validated @PathVariable Integer id){
		if(repo.existsById(id)) {
			Optional<Medicine> med=repo.findById(id);
			String Result="Name :"+med.get().getName()+"-----Price :"+med.get().getPrice()+"-----STock :"+med.get().getStockLeft();
			return new ResponseEntity<String>(Result,HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No Stock Found",HttpStatus.BAD_REQUEST);
		}
		
	}
	@DeleteMapping(value="/deleteById/{id}") 
	public ResponseEntity<String> deleteById(@Validated @PathVariable Integer id) {
		if(repo.existsById(id)) {
			service.getMedicineById(id);
		return new ResponseEntity<String>("Deleted Medicine Details Successfully",HttpStatus.OK);
		}
		else {
			return new ResponseEntity<String>("No Medicine with Id",HttpStatus.BAD_REQUEST);
		}
}
//	@DeleteMapping(value="/deleteAllById/{id}") 
//	public ResponseEntity<String> deleteAllById(@Validated @RequestBody Medicine med) {
//		if(repo.existsById(med.getId())) {
//			repo.deleteAllById(med);
//		return new ResponseEntity<String>("Deleted Medicine Details Successfully",HttpStatus.OK);
//		}
//		else {
//			return new ResponseEntity<String>("No Medicine with Id",HttpStatus.BAD_REQUEST);
//		}
//}
	
	
}