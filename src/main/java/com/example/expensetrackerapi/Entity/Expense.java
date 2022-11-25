package com.example.expensetrackerapi.Entity;

import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
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
    @NotBlank(message = "Expense name must not be null")
    @Size(min = 3 , message = "Expense name must be at least three characters ")
    private String name;

    private String description;

    @Column(name = "expense_amount")
    @NotNull(message = "Expense amount must not be null")
    private BigDecimal amount;

    @NotBlank(message = "Expense category must not be null")
    private String category;

    @NotNull(message = "Expense date must not be null")
    private Date date;

    @Column(name = "create_at" , nullable = false , updatable = false)
    @CreationTimestamp
    private Timestamp CreationTime ;

    @Column(name = "update_at" , nullable = false , updatable = true)
    @UpdateTimestamp
    private Timestamp UpdateTime ;

}
