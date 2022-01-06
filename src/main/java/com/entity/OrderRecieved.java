package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="OrderRecived", schema="dashboard")
public class OrderRecieved extends KeyEntity{
	
	private int orderReceived;
	private String dateReceived;
	
	public int getOrderReceived() {
		return orderReceived;
	}
	public String getDateReceived() {
		return dateReceived;
	}
	public void setOrderReceived(int orderReceived) {
		this.orderReceived = orderReceived;
	}
	public void setDateReceived(String dateReceived) {
		this.dateReceived = dateReceived;
	}
	
	@Override
	public String toString() {
		return "OrderRecived [orderReceived=" + orderReceived + ", dateReceived=" + dateReceived + "]";
	}
	
}
