package com.bank.api.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ACCOUNT")  // S'assure que le nom de la table est bien "ACCOUNT"
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private BigDecimal balance;

    public Account() {
    }

    public BigDecimal getBalance() {
        return null;
    }

    public void setBalance(BigDecimal subtract) {

    }

    // Getters et Setters
}
