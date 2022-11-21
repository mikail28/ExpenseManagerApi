package com.example.expensetrackerapi.Repository;

import com.example.expensetrackerapi.Entity.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense , Long> {

}
