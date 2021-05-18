package com.coronaconsultation.services;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import com.coronaconsultation.entities.MedicineReport;
import com.coronaconsultation.repository.MedicineReportRepo;
import com.coronaconsultation.service.MedicineReportService;
import com.coronaconsultation.service.MedicineReportServiceImpl;
@TestInstance(Lifecycle.PER_CLASS)
public class MedicineReportServiceTest {
	@InjectMocks
	private MedicineReportServiceImpl MedicineReportService;
	
	@Mock
	private MedicineReportRepo MedicineReportRepository;
	
	@SuppressWarnings("deprecation")
	@BeforeAll
	public void init() {
		MockitoAnnotations.initMocks(this);
	}

	@Autowired
	private MedicineReportRepo repo;
	@Test
	void getallReports() {
		MedicineReport Medicinereport = new MedicineReport();
		
		when(repo.save(Medicinereport)).thenReturn(Medicinereport);
		Medicinereport = repo.save(Medicinereport);
		
		assertEquals("medicine_report_id", Medicinereport.getMedicineReportId());
		verify(Medicinereport, times(1)).getMedicineReportId();
	}

}