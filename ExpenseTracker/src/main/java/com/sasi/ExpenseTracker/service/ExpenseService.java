package com.sasi.ExpenseTracker.service;

import java.util.List;

import com.sasi.ExpenseTracker.model.Expense;

public interface ExpenseService {
	
	List<Expense>findAll();
	
	Expense save(Expense expense);
	
	Expense findById(Long id);
}
