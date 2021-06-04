package com.coronaconsultation.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.coronaconsultation.CoronaConsultationApplication;
import com.coronaconsultation.entities.Medicine;
import com.coronaconsultation.entities.MedicineReport;
import com.coronaconsultation.repository.MedicineReportRepo;
import com.coronaconsultation.repository.MedicineRepository;
import com.coronaconsultation.service.MedicineReportService;
import com.coronaconsultation.service.MedicineService;
import com.coronaconsultation.service.MedicineServiceImpl;
import com.sun.el.stream.Stream;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class MedicineReportTesting {
	@Autowired
	private MedicineReport medrepo;
	
	@Autowired
	private MedicineReportService mrs;	
	@MockBean
	private MedicineReportRepo report;
	
	MedicineReport med= new MedicineReport();
	


	@Test
	public void findReportId() {
		assertNotNull(report.findById(1));
    }
	
	@Test
	public void savetest() throws Exception {
		med.setMedicineReportId(1);
	when(report.save(med)).thenReturn(med);
	MedicineReport savetest= mrs.saveReport(med);
	assertTrue(savetest!=null);
		
	}
	@Test
	public void getAllTest() throws Exception {
		
	List<MedicineReport> list= mrs.getAllReports();
	assertTrue(list.equals(report.findAll()));
		
	}
	
	
	
}
	
