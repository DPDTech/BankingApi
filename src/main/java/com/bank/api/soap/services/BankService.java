package com.bank.api.soap.services;

import com.bank.api.entities.Account;
import com.bank.api.entities.Transaction;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.math.BigDecimal;
import java.util.List;

@Endpoint
class BankServiceEndpoint {

    @PayloadRoot(namespace = "http://www.bank.com/soap", localPart = "GetBalanceRequest")
    @ResponsePayload
    public <GetBalanceResponse> GetBalanceResponse getBalance(@RequestPayload GetBalanceRequest request) {
        // Traitement
        return null;
    }
}

@WebService
public interface BankService {

    @WebMethod
    BigDecimal getBalance(@WebParam(name = "accountId") Long accountId);

    @WebMethod
    List<Transaction> getTransactions(
            @WebParam(name = "accountId") Long accountId,
            @WebParam(name = "pageNumber") int pageNumber,
            @WebParam(name = "pageSize") int pageSize);

    @WebMethod
    void transferFunds(
            @WebParam(name = "creditorId") Long creditorId,
            @WebParam(name = "debtorId") Long debtorId,
            @WebParam(name = "amount") BigDecimal amount);
}
