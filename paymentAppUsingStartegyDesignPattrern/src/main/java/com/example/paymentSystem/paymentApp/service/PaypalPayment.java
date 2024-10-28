package com.example.paymentSystem.paymentApp.service;


import org.springframework.stereotype.Component;

import com.example.paymentSystem.paymentApp.Enum.PaymentType;

@Component
public class PaypalPayment implements PaymentStrategy  {

    @Override
    public void pay(double amount) {
        System.out.println("Paid "+ amount + " using paypal");
    }

    @Override
    public PaymentType getType() {
        return PaymentType.PAYPAL_PAYMENT;
    }
    
}
