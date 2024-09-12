package com.bank.api.soap.services;

import javax.jws.WebService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service  // Assure que cette classe est reconnue comme un bean Spring
@WebService  // Indique que cette classe expose un service SOAP
public class BankServiceImpl {

    public BigDecimal getBalance(Long accountId) {
        return BigDecimal.valueOf(1000);
    }
}
