package com.sasi.ExpenseTracker.service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Expense findById(Long id) {

	if (expenseRepository.findById(id).isPresent()) {
	    return expenseRepository.findById(id).get();
	} else {
	    return null;
	}
    }

    @Override
    public void deleteExpense(Long id) {

	Expense expense = findById(id);
	
	expenseRepository.delete(expense);

    }

}
