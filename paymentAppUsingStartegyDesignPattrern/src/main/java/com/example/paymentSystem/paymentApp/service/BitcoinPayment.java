package com.example.paymentSystem.paymentApp.service;

import org.springframework.stereotype.Component;

import com.example.paymentSystem.paymentApp.Enum.PaymentType;

@Component
public class BitcoinPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount + " using bitcoin.");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.BITCOIN_PAYMENT;
    }
    
}
