package com.sasi.ExpenseTracker.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_expenses")
public class Expense {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String expenseName;
	
	private String description;
	
	private BigDecimal amount;

	

	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getExpenseName() {
		return expenseName;
	}



	public void setExpenseName(String expenseName) {
		this.expenseName = expenseName;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public BigDecimal getAmount() {
		return amount;
	}



	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Expense [id=" + id + ", expenseName=" + expenseName + ", description=" + description + ", amount="
				+ amount + "]";
	}
	
	
}
