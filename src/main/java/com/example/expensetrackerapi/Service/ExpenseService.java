package com.example.expensetrackerapi.Service;

import com.example.expensetrackerapi.Entity.Expense;
import com.example.expensetrackerapi.Repository.ExpenseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ExpenseService implements ExpenseServiceI{

    private final ExpenseRepository expenseRepository ;

    public Page<Expense> getAllExpenses(Pageable page){
        return expenseRepository.findAll(page) ;
    }

    @Override
    public Expense getExpenseById(Long id) {
       Optional<Expense> expense =  expenseRepository.findById(id) ;
       if (expense.isPresent()){
           return expense.get() ;
       }else {
           throw new RuntimeException("Expense is not found for the id"+id) ;
       }
    }

    @Override
    public void deleteExpenseById(Long id) {
        expenseRepository.deleteById(id);

    }

    @Override
    public void saveExpense(Expense expense) {
        expenseRepository.save(expense) ;
    }

    @Override
    public Expense updateExpense(Long id, Expense expense) {
        Expense existingExpense = getExpenseById(id);
        existingExpense.setName(expense.getName() != null ? expense.getName() : existingExpense.getName());
        existingExpense.setCategory(expense.getCategory() != null ? expense.getCategory() : existingExpense.getCategory());
        existingExpense.setAmount(expense.getAmount() != null ? expense.getAmount() : existingExpense.getAmount());
        existingExpense.setDate(expense.getDate() != null ? expense.getDate() : existingExpense.getDate());
        existingExpense.setDescription(expense.getDescription() != null ? expense.getDescription() : existingExpense.getDescription());
        return expenseRepository.save(existingExpense) ;
    }


}
