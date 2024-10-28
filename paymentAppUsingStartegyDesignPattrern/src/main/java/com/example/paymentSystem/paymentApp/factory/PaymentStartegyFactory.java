package com.example.paymentSystem.paymentApp.factory;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.paymentSystem.paymentApp.Enum.PaymentType;
import com.example.paymentSystem.paymentApp.service.PaymentStrategy;

@Component
public class PaymentStartegyFactory {
    private final Map<PaymentType, PaymentStrategy> startegy;

    public PaymentStartegyFactory(List<PaymentStrategy> strategies) {
        this.startegy = new EnumMap<>(PaymentType.class);
        strategies.forEach(paymentStrategy -> startegy.put(paymentStrategy.getType(), paymentStrategy));
    }

    public PaymentStrategy getPaymentStrategy(PaymentType paymentType) {
        PaymentStrategy paymentStrategy = startegy.get(paymentType);
        if (paymentStrategy == null) {
            throw new IllegalArgumentException("Invalid payment method: " + paymentType);
        }
        return paymentStrategy;
    }
    
}
