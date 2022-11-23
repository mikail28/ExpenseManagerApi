package com.example.expensetrackerapi.Service;

import com.example.expensetrackerapi.Entity.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ExpenseServiceI {
    Page<Expense> getAllExpenses(Pageable page) ;

    Expense getExpenseById(Long id) ;

    void deleteExpenseById(Long id) ;

    void saveExpense(Expense expense);

    Expense updateExpense(Long id , Expense expense);
}
