package com.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="ProductCategory", schema="dashboard")
public class ProductCategory extends KeyEntity {
	
	private String categoryName;
	private int percentage;
	private boolean bestCategory;
	
	public String getCategoryName() {
		return categoryName;
	}
	public int getPercentage() {
		return percentage;
	}
	public boolean isBestCategory() {
		return bestCategory;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public void setPercentage(int percentage) {
		this.percentage = percentage;
	}
	public void setBestCategory(boolean bestCategory) {
		this.bestCategory = bestCategory;
	}
	
	@Override
	public String toString() {
		return "ProductCategory [categoryName=" + categoryName + ", percentage=" + percentage + ", bestCategory="
				+ bestCategory + "]";
	}
	
}
