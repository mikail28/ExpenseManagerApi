package com.example.expensetrackerapi.controller;

import com.example.expensetrackerapi.Entity.Expense;
import com.example.expensetrackerapi.Service.ExpenseService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class ExpenseController {

    private final ExpenseService expenseService;

    @GetMapping("/expenses")
    public List<Expense> getAllExpenses(Pageable page) {
        return expenseService.getAllExpenses(page).toList(); // sort=fieldName,desc  to sort from biggest to smallest
    }

    @GetMapping("/expenses/{id}")
    public Expense getExpenseById(@PathVariable("id") Long id) {
        return expenseService.getExpenseById(id);
    }

    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    @DeleteMapping("/expenses")
    public void DeleteExpenseById(@RequestParam("id") Long id) {
        expenseService.deleteExpenseById(id);
    }

    @ResponseStatus(value = HttpStatus.CREATED)
    @PostMapping("/expenses")
    public void saveExpense(@Valid @RequestBody Expense expense) {
        expenseService.saveExpense(expense);
    }

    @PutMapping("/expenses")
    public Expense updateExpense(@RequestParam("id") Long id, @RequestBody Expense expense) {
        return expenseService.updateExpense(id, expense);
    }

}
