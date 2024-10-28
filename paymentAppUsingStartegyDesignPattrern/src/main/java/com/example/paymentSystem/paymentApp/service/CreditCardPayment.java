package com.example.paymentSystem.paymentApp.service;

import org.springframework.stereotype.Component;

import com.example.paymentSystem.paymentApp.Enum.PaymentType;

@Component
public class CreditCardPayment implements PaymentStrategy{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount +" using credit card");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.CREDIT_CARD_PAYMENT;
    } 
}