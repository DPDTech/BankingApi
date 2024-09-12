package com.bank.api.controllers;


import com.bank.api.entities.Account;
import com.bank.api.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RequestMapping("/api/accounts")
@Api(value = "Account Management System", description = "Operations pertaining to accounts in the Banking API")
@RestController
public class AccountController {


    @Autowired
    private AccountService accountService;

    @GetMapping
    public List<Account> getAllAccounts() {
        // Retourne tous les comptes
        return accountService.getAllAccounts();
    }

    @GetMapping("/{id}")
    public Account getAccountById(@PathVariable Long id) {
        // Retourne un compte spécifique par son ID
        return accountService.getAccountById(id);
    }

    @PostMapping("/{accountId}/transfer")
    public ResponseEntity<Void> transferFunds(@PathVariable Long accountId, @RequestBody BigDecimal amount) {
        accountService.transferFunds(accountId, amount);
        return ResponseEntity.ok().build();
    }

}

