package com.scaler.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class StripePaymentGateway implements PaymentGateway {
    @Override
    public String generatePaymentLink() {

        return null;
    }
}