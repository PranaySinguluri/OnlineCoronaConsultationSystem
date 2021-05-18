package com.coronaconsultation.service;

import java.util.List;
import java.util.Optional;

import com.coronaconsultation.entities.Medicine;
import com.coronaconsultation.entities.MedicineReport;

public interface MedicineReportService {
	public List<MedicineReport> getAllreports();
	public MedicineReport saveReport(MedicineReport med);
	public Optional<MedicineReport> getpatientreports(int id);
}
