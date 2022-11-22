package com.example.expensetrackerapi.Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name = "tbl_expenses")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "expense_name")
    private String name;

    private String description;

    @Column(name = "expense_amount")
    private BigDecimal amount;

    private String category;

    private Date date;

    @Column(name = "create_at" , nullable = false , updatable = false)
    @CreationTimestamp
    private Timestamp CreationTime ;

    @Column(name = "update_at" , nullable = false , updatable = true)
    @UpdateTimestamp
    private Timestamp UpdateTime ;

}
