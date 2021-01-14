package com.sasi.ExpenseTracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sasi.ExpenseTracker.model.Expense;
import com.sasi.ExpenseTracker.repository.ExpenseRepository;

@Service
public class ExpenseServiceImpl implements ExpenseService {

	
	@Autowired
	ExpenseRepository expenseRepository;
	
	@Override
	public List<Expense> findAll() {
	
		return expenseRepository.findAll();
	}

	@Override
	public Expense save(Expense expense) {
		
		Expense save = expenseRepository.save(expense);
		return save;
	}

}
