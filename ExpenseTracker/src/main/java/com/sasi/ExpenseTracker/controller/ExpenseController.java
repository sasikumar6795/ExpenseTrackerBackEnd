package com.sasi.ExpenseTracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sasi.ExpenseTracker.model.Expense;
import com.sasi.ExpenseTracker.service.ExpenseServiceImpl;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1")
public class ExpenseController {

	@Autowired
	ExpenseServiceImpl expenseServiceImpl;

	@GetMapping("/expenses")
	public ResponseEntity<List<Expense>> get() {
		List<Expense> findAll = expenseServiceImpl.findAll();
		return new ResponseEntity<List<Expense>>(findAll, HttpStatus.OK);
	}

	@PostMapping("/expenses")
	public ResponseEntity<Expense> save(@RequestBody Expense expense) {
		Expense saveExpenses = expenseServiceImpl.save(expense);
		return new ResponseEntity<Expense>(saveExpenses, HttpStatus.OK);
	}

}
