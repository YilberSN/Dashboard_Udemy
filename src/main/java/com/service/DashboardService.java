package com.service;

import java.util.List;

import com.entity.*;

public interface DashboardService {

	List<CompanyRevenue> getTodayRevenueDash();
	
	List<ProductCategory> getBestCategory();
	
	List<OrderRecieved> getAllOrderRecieved();
	
	List<OrderCollectionStatus> getOrderCollection();
	
	List<EmployeeInformation> getAllEmployee();
	
	void addEmployee(EmployeeInformation employeeInformation);
	
	EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);
	
	void deleteEmployee (EmployeeInformation employeeInformation);
	
}
