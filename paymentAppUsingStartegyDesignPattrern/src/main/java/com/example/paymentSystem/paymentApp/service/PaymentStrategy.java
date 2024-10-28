package com.example.paymentSystem.paymentApp.service;

import com.example.paymentSystem.paymentApp.Enum.PaymentType;

public interface PaymentStrategy {

    PaymentType getType();

    void pay(double amount);
}
