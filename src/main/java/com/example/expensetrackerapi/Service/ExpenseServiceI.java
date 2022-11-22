package com.example.expensetrackerapi.Service;

import com.example.expensetrackerapi.Entity.Expense;

import java.util.List;

public interface ExpenseServiceI {
    List<Expense> getAllExpenses() ;

    Expense getExpenseById(Long id) ;

    void deleteExpenseById(Long id) ;

    void saveExpense(Expense expense);

    Expense updateExpense(Long id , Expense expense);
}
