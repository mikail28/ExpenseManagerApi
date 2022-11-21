package com.example.expensetrackerapi.Service;

import com.example.expensetrackerapi.Entity.Expense;
import com.example.expensetrackerapi.Repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ExpenseService implements ExpenseServiceI{

    private final ExpenseRepository expenseRepository ;

    public List<Expense> getAllExpenses(){
        return expenseRepository.findAll() ;
    };
}
