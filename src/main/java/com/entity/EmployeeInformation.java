package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeInformation", schema="dashboard")
public class EmployeeInformation extends KeyEntity {

	private String _name;
	private String position;
	private String officeLocation;
	private int age;
	private Date startDate;
	private double salary;
	
	public String get_name() {
		return _name;
	}
	public String getPosition() {
		return position;
	}
	public String getOfficeLocation() {
		return officeLocation;
	}
	public int getAge() {
		return age;
	}
	public Date getStartDate() {
		return startDate;
	}
	public double getSalary() {
		return salary;
	}
	public void set_name(String _name) {
		this._name = _name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setOfficeLocation(String officeLocation) {
		this.officeLocation = officeLocation;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EmployeeInformation [_name=" + _name + ", position=" + position + ", officeLocation=" + officeLocation
				+ ", age=" + age + ", startDate=" + startDate + ", salary=" + salary + "]";
	}
	
}
