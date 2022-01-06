package com.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.entity.*;
import com.repositories.*;
import com.service.DashboardService;

public class DashboardServiceImpl implements DashboardService{
	
	@Autowired
	private CompanyRevenueRepository companyRevenueRepository;
	
	@Autowired
	private EmployeeInformationRepository employeeInformationRepository;
	
	@Autowired
	private OrderCollectionStatusRepository orderCollectionStatusRepository;

	@Autowired
	private OrderRecievedRepository orderRecievedRepository;
	
	@Autowired
	private ProductCategoryRepository productCategoryRepository;
	
	
	@Override
	public List<CompanyRevenue> getTodayRevenueDash() {
		return companyRevenueRepository.findAll();
	}

	@Override
	public List<ProductCategory> getBestCategory() {
		return productCategoryRepository.findByBestCategory(true);
	}

	@Override
	public List<OrderRecieved> getAllOrderRecieved() {
		return orderRecievedRepository.findAll();
	}

	@Override
	public List<OrderCollectionStatus> getOrderCollection() {
		return orderCollectionStatusRepository.findAll();
	}

	@Override
	public List<EmployeeInformation> getAllEmployee() {
		return employeeInformationRepository.findAll();
	}

	@Override
	public void addEmployee(EmployeeInformation employeeInformation) {
		employeeInformationRepository.save(employeeInformation);
	}

	@Override
	public EmployeeInformation updateEmployee(EmployeeInformation employeeInformation) {
		return employeeInformationRepository.save(employeeInformation);
	}

	@Override
	public void deleteEmployee(EmployeeInformation employeeInformation) {
		employeeInformationRepository.delete(employeeInformation);
	}
	

}
