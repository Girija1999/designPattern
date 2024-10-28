package com.example.paymentSystem.paymentApp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.paymentSystem.paymentApp.Enum.PaymentType;
import com.example.paymentSystem.paymentApp.service.PaymentService;

@RestController
public class PaymentController {
    private final PaymentService paymentService;


    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    
    @PostMapping("/pay")
    public ResponseEntity<String> makePayment(@RequestParam PaymentType paymentType, @RequestParam double amount) {
        paymentService.processPayment(paymentType, amount);
        return new ResponseEntity<>("Payment successful using " + paymentType, HttpStatus.OK);
    }
    @GetMapping("/")
    public String sayHello(){
        return "Hello";
    }
}
