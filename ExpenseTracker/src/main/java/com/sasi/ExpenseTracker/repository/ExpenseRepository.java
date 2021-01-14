package com.sasi.ExpenseTracker.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sasi.ExpenseTracker.model.Expense;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> 
{
	
}
