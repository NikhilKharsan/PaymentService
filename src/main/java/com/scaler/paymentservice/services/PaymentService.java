package com.scaler.paymentservice.services;

import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private PaymentGatewaySelector paymentGatewaySelector;

    public PaymentService(PaymentGatewaySelector paymentGatewaySelector) {
        this.paymentGatewaySelector = paymentGatewaySelector;
    }

    public String generatePymentLink(){
        //logic to update the DB when the payment starts

        return paymentGatewaySelector.getPaymentGateway().generatePaymentLink();
    }

}
