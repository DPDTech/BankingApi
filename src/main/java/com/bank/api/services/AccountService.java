package com.bank.api.services;


import com.bank.api.entities.Account;
import com.bank.api.entities.Transaction;
import com.bank.api.repositories.AccountRepository;
import com.bank.api.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private TransactionRepository transactionRepository;
    private BigDecimal balance;

    // Getter pour balance
    public BigDecimal getBalance(Long accountId) {
        BigDecimal balance = null;
        return balance;
    }

    // Setter pour balance
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Page<Transaction> getTransactions(Long accountId, int pageNumber, int pageSize) {
        return transactionRepository.findByAccountId(accountId, PageRequest.of(pageNumber, pageSize));
    }

    public void transferFunds(Long accountId, BigDecimal amount) {
        // Implement the logic for transferring funds
    }

    public List<Account> getAllAccounts() {
        return List.of();
    }

    public Account getAccountById(Long id) {
        return null;
    }

}

