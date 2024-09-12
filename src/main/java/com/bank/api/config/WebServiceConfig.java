package com.bank.api.config;

import com.bank.api.soap.services.BankServiceImpl;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    private final Bus bus;
    private final BankServiceImpl bankServiceImpl;

    // Le constructeur doit être public pour que Spring puisse l'utiliser
    public WebServiceConfig(Bus bus, BankServiceImpl bankServiceImpl) {
        this.bus = bus;
        this.bankServiceImpl = bankServiceImpl;
    }

    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(bus, bankServiceImpl);
        endpoint.publish("/bankService");
        return endpoint;
    }
}
