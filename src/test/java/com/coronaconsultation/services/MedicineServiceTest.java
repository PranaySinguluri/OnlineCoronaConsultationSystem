package com.coronaconsultation.services;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.coronaconsultation.service.MedicineServiceImpl;
import com.coronaconsultation.entities.Medicine;
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
	@Test
	 void getAllreports() {
		Medicine med = new Medicine();
				
	}
	@Test
	public void getMedicineById() {
		// when()
	}
//		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { 1, 2, 3 });
//		assertEquals(6, business.calculateSumUsingDataService());

}
