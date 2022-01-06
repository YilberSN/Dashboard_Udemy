package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OrderCollectionStatus", schema="dashboard")
public class OrderCollectionStatus extends KeyEntity {

	private int newOrders;
	private double revenue;
	private int shipped;
	private int returned;
	
	public int getNewOrders() {
		return newOrders;
	}
	public double getRevenue() {
		return revenue;
	}
	public int getShipped() {
		return shipped;
	}
	public int getReturned() {
		return returned;
	}
	public void setNewOrders(int newOrders) {
		this.newOrders = newOrders;
	}
	public void setRevenue(double revenue) {
		this.revenue = revenue;
	}
	public void setShipped(int shipped) {
		this.shipped = shipped;
	}
	public void setReturned(int returned) {
		this.returned = returned;
	}
	
	@Override
	public String toString() {
		return "OrderCollectionStatus [newOrders=" + newOrders + ", revenue=" + revenue + ", shipped=" + shipped
				+ ", returned=" + returned + "]";
	}
	
}
