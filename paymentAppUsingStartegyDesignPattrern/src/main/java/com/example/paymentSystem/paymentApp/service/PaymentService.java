package com.example.paymentSystem.paymentApp.service;

import org.springframework.stereotype.Service;

import com.example.paymentSystem.paymentApp.Enum.PaymentType;
import com.example.paymentSystem.paymentApp.factory.PaymentStartegyFactory;

@Service
public class PaymentService {
    private PaymentStartegyFactory paymentStrategyFactory;

    public PaymentService(PaymentStartegyFactory paymentStartegyFactory) {
        this.paymentStrategyFactory = paymentStartegyFactory;
    }
    
    public void processPayment(PaymentType paymentType, double amount) {
        PaymentStrategy paymentStrategy = paymentStrategyFactory.getPaymentStrategy(paymentType);
        paymentStrategy.pay(amount); 
    }
}
