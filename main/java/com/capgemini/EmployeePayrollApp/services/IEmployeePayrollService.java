package com.capgemini.EmployeePayrollApp.services;

import java.util.List;
import com.capgemini.EmployeePayrollApp.dto.EmployeePayrollDTO;
import com.capgemini.EmployeePayrollApp.model.EmployeePayrollData;

public interface IEmployeePayrollService {

	List<EmployeePayrollData> getEmployeePayrollData();

	EmployeePayrollData getEmployeePayrollData(int empId);

	EmployeePayrollData createEmployeePayrollData(EmployeePayrollDTO empPayrollDTO);

	void deleteEmployeePayrollData(int empId);

	EmployeePayrollData updateEmployeePayrollData(int empId, EmployeePayrollDTO employeeDTO);
}
