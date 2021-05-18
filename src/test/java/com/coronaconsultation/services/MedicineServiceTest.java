package com.coronaconsultation.services;

import org.junit.jupiter.api.BeforeAll;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.coronaconsultation.service.MedicineServiceImpl;
import com.coronaconsultation.repository.MedicineRepository;
public class MedicineServiceTest {
	@InjectMocks
	private MedicineServiceImpl MedicineService;
	
	@Mock
	private MedicineRepository MedicineRepository;
	@SuppressWarnings("deprecation")
	@BeforeAll
	public void init() {
		MockitoAnnotations.initMocks(this);

}
}
