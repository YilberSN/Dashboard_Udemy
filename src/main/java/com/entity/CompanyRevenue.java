package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CompanyRevenue", schema="dashboard")
public class CompanyRevenue extends KeyEntity {
	
	@Column(name="Revenue_Month", nullable=false)
	private String _month;
	@Column(name="revenue", nullable=false)
	private double revenue;
	@Column(name="expense")
	private double expense;
	@Column(name="margins")
	private double margins;
	
	public String get_month() {
		return _month;
	}
	public double getRevenue() {
		return revenue;
	}
	public double getExpense() {
		return expense;
	}
	public double getMargins() {
		return margins;
	}
	public void set_month(String _month) {
		this._month = _month;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public void setExpense(double expense) {
		this.expense = expense;
	}
	public void setMargins(double margins) {
		this.margins = margins;
	}
	
	@Override
	public String toString() {
		return "CompanyRevenue [_month=" + _month + ", revenue=" + revenue + ", expense=" + expense + ", margins="
				+ margins + "]";
	}
	
}
