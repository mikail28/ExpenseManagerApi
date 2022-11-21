package com.example.expensetrackerapi.controller;

import com.example.expensetrackerapi.Entity.Expense;
import com.example.expensetrackerapi.Service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService ;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(){

        return expenseService.getAllExpenses() ;

    }
}
