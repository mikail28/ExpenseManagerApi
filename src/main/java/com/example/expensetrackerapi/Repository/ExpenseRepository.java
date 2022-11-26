package com.example.expensetrackerapi.Repository;

import com.example.expensetrackerapi.Entity.Expense;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Date;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense , Long> {

    //SELECT * FROM tbl_expenses WHERE category =?
    Page<Expense> findByCategory(String category , Pageable page);

    Page<Expense> findByNameContaining(String name , Pageable page);

    Page<Expense> findByDateBetween(Date startDate , Date endDate , Pageable page);

}
