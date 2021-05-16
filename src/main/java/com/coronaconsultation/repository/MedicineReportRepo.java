package com.coronaconsultation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.coronaconsultation.entities.MedicineReport;
@EnableJpaRepositories
@Repository
public interface MedicineReportRepo  extends JpaRepository<MedicineReport, Integer>{

}
